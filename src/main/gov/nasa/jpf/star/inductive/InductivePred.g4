grammar InductivePred;

@header {
package gov.nasa.jpf.star.inductive;
}

// parser
pred : PRED ID LB params RB EQEQ formulas ;

params : param | param CM params ;
param : ID ;

formulas : formula | formula OR formulas ;
formula : heapTerms | pureTerms | heapTerms AND pureTerms ;

heapTerms : heapTerm | heapTerm STAR heapTerms ;
heapTerm : pointToTerm | inductiveTerm ;

pointToTerm : ID PT ID LB params RB ;
inductiveTerm : ID LB params RB ;

pureTerms : pureTerm | pureTerm AND pureTerms ;
pureTerm : eqNullTerm | neNullTerm | eqTerm | neTerm ;

eqNullTerm : ID EQ NULL;
neNullTerm : ID NE NULL;
eqTerm : ID EQ ID;
neTerm : ID NE ID;

// lexer
PRED    : 'pred' ;
NULL    : 'null' ;
EQEQ    : '==' ;
EQ      : '=' ;
NE      : '!=' ;
LB      : '(' ;
RB      : ')' ;
CM      : ',' ;
OR      : '||' ;
AND     : '&' ;
PT      : '->' ;
STAR    : '*' ;
ID      : [a-zA-Z]+ ;
WS      : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

// tests
// pred sll(x) == x = null || x->Node(next) * sll(next)