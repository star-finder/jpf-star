grammar InductivePred;

@header {
package star.predicate;

import star.formula.*;
import star.formula.heap.*;
import star.formula.pure.*;
import star.formula.expression.*;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.symbc.numeric.Operator;
}

// parser
preds returns [InductivePred[] ips] :
	pred
	{
		$ips = new InductivePred[1];
		$ips[0] = $pred.ip;
	}
	| pred tail
	{
		int length = $tail.ips.length + 1;
		$ips = new InductivePred[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) $ips[0] = $pred.ip;
			else $ips[i] = $tail.ips[i - 1];
		}
	}
;

tail returns [InductivePred[] ips] :
	SM pred
	{
		$ips = new InductivePred[1];
		$ips[0] = $pred.ip;
	}
	| SM pred tail
	{
		int length = $tail.ips.length + 1;
		$ips = new InductivePred[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) $ips[0] = $pred.ip;
			else $ips[i] = $tail.ips[i - 1];
		}
	}
;

pred returns [InductivePred ip] :
	PRED ID LB params RB EQEQ formulas
	{
		Variable[] ps = $params.vars;
		Formula[] fs = $formulas.fs;
		
		$ip = new InductivePred($ID.text, ps, fs);
	}
;

params returns [Variable[] vars] :
	param
	{
		$vars = new Variable[1];
		$vars[0] = $param.var;
	}
	| param CM params
	{
		int length = $params.vars.length + 1;
		$vars = new Variable[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) $vars[i] = $param.var;
			else $vars[i] = $params.vars[i - 1];
		}
	}
;

param returns [Variable var] : ID 
	{
		$var = new Variable($ID.text, "");
	}
;

formulas returns [Formula[] fs] :
	formula
	{
		$fs = new Formula[1];
		$fs[0] = $formula.f;
	}
	| formula OR formulas
	{
		int length = $formulas.fs.length + 1;
		$fs = new Formula[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) $fs[i] = $formula.f;
			else $fs[i] = $formulas.fs[i - 1];
		}
	}
;

formula returns [Formula f] :
	heapTerms
	{
		HeapFormula hFormula = $heapTerms.hFormula;
		PureFormula pFormula = new PureFormula();
		$f = new Formula(hFormula, pFormula);
	}
	| pureTerms
	{
		HeapFormula hFormula = new HeapFormula();
		PureFormula pFormula = $pureTerms.pFormula;
		$f = new Formula(hFormula, pFormula);
	}
	| heapTerms AND pureTerms
	{
		HeapFormula hFormula = $heapTerms.hFormula;
		PureFormula pFormula = $pureTerms.pFormula;
		$f = new Formula(hFormula, pFormula);
	}
;

heapTerms returns [HeapFormula hFormula] :
	heapTerm
	{
		$hFormula = new HeapFormula($heapTerm.term);
	}
	| heapTerm STAR heapTerms
	{
		HeapFormula oldHeapFormula = $heapTerms.hFormula;
		HeapTerm[] oldHeapTerms = oldHeapFormula.getHeapTerms();
		
		int length = oldHeapTerms.length + 1;
		HeapTerm[] newHeapTerms = new HeapTerm[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) newHeapTerms[i] = $heapTerm.term;
			else newHeapTerms[i] = oldHeapTerms[i - 1];
		}
		
		$hFormula = new HeapFormula(newHeapTerms);
	}
;

heapTerm returns [HeapTerm term] :
	pointToTerm
	{
		$term = $pointToTerm.term;
	}
	| inductiveTerm
	{
		$term = $inductiveTerm.term;
	}
;

pointToTerm returns [HeapTerm term] :
	root=ID PT type=ID LT GT
	{
		Variable[] vars = new Variable[1];
		vars[0] = new Variable($root.text, "");
		$term = new PointToTerm($type.text, vars);
	}
	| root=ID PT type=ID LT params GT
	{
		int length = $params.vars.length + 1;
		
		Variable[] vars = new Variable[length];
		for (int i = 0; i < length; i++) {
			if (i == 0) vars[i] = new Variable($root.text, "");
			else vars[i] = $params.vars[i - 1];
		}
		
		$term = new PointToTerm($type.text, vars);
	}
;

inductiveTerm returns [HeapTerm term] : ID LB params RB 
	{
		$term = new InductiveTerm($ID.text, $params.vars);
	}
;

pureTerms returns [PureFormula pFormula]:
	pureTerm 
	{
		$pFormula = new PureFormula($pureTerm.term);
	}
	| pureTerm AND pureTerms
	{
		PureFormula oldPureFormula = $pureTerms.pFormula;
		PureTerm[] oldPureTerms = oldPureFormula.getPureTerms();
		
		int length = oldPureTerms.length + 1;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) newPureTerms[i] = $pureTerm.term;
			else newPureTerms[i] = oldPureTerms[i - 1];
		}
		
		$pFormula = new PureFormula(newPureTerms);
	}
;

pureTerm returns [PureTerm term]: 
	eqNullTerm
	{
		$term = $eqNullTerm.term;
	}
	| neNullTerm
	{
		$term = $neNullTerm.term;
	}
	| eqTerm
	{
		$term = $eqTerm.term;
	}
	| neTerm
	{
		$term = $neTerm.term;
	}
	| comparisonTerm
	{
		$term = $comparisonTerm.term;
	}
;

eqNullTerm returns [PureTerm term] : ID EQ NULL
	{
		Variable var = new Variable($ID.text, "");
		
		$term = new EqNullTerm(var);
	}
;

neNullTerm returns [PureTerm term] : ID NE NULL
	{
		Variable var = new Variable($ID.text, "");
		
		$term = new NEqNullTerm(var);
	}
;

eqTerm returns [PureTerm term] : var1=ID EQ var2=ID
	{
		Variable var1 = new Variable($var1.text, "");
		Variable var2 = new Variable($var2.text, "");
		
		$term = new EqTerm(var1, var2);
	}
;

neTerm returns [PureTerm term] : var1=ID NE var2=ID
	{
		Variable var1 = new Variable($var1.text, "");
		Variable var2 = new Variable($var2.text, "");
		
		$term = new NEqTerm(var1, var2);
	}
;

comparisonTerm returns [PureTerm term] : exp1=exp comp exp2=exp
	{
		$term = new ComparisonTerm($comp.c, $exp1.e, $exp2.e);
	}
;

comp returns [Comparator c] :
	EQ
	{
		$c = Comparator.EQ;
	}
	| NE
	{
		$c = Comparator.NE;
	}
	| GE
	{
		$c = Comparator.GE;
	}
	| GT
	{
		$c = Comparator.GT;
	}
	| LE
	{
		$c = Comparator.LE;
	}
	| LT
	{
		$c = Comparator.LT;
	}
;

exp returns [Expression e] :
	exp1=exp PLUS ter
	{
		Expression exp1 = $exp1.e;
		Expression exp2 = $ter.e;
		
		$e = new BinaryExpression(Operator.PLUS, exp1, exp2);
	}
	| exp1=exp MINUS ter
	{
		Expression exp1 = $exp1.e;
		Expression exp2 = $ter.e;
		
		$e = new BinaryExpression(Operator.MINUS, exp1, exp2);
	}
	| ter
	{
		$e = $ter.e;
	}
;
	
ter returns [Expression e] :
	var1=ID MUL var2=ID
	{
		Expression exp1 = new VariableExpression(new Variable($var1.text, ""));
		Expression exp2 = new VariableExpression(new Variable($var2.text, ""));
		
		$e = new BinaryExpression(Operator.MUL, exp1, exp2);
	}
	| var1=ID DIV var2=ID
	{
		Expression exp1 = new VariableExpression(new Variable($var1.text, ""));
		Expression exp2 = new VariableExpression(new Variable($var2.text, ""));
	
		$e = new BinaryExpression(Operator.DIV, exp1, exp2);
	}
	| ID
	{
		$e = new VariableExpression(new Variable($ID.text, ""));
	}
	| INT
	{
		$e = new LiteralExpression($INT.text);
	}
	| DOUBLE
	{
		$e = new LiteralExpression($DOUBLE.text);
	}
	| LB exp RB
	{
		$e = $exp.e;
	}
;

// lexer
PRED    : 'pred' ;
NULL    : 'null' ;
EQEQ    : '==' ;
EQ      : '=' ;
NE      : '!=' ;
GE		: '>=' ;
GT		: '>' ;
LE		: '<=' ;
LT		: '<' ;
PLUS	: '+' ;
MINUS	: '-' ;
MUL		: '**' ;
DIV		: '/' ;
LB      : '(' ;
RB      : ')' ;
CM      : ',' ;
SM      : ';' ;
OR      : '||' ;
AND     : '&' ;
PT      : '::' ;
STAR    : '*' ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
INT		: '0'|[1-9][0-9]* ;
DOUBLE	: INT'.'INT ;
WS      : [ \t\r\n]+ -> skip ;

// tests
// pred sll(x) == x = null || x->Node(next) * sll(next)