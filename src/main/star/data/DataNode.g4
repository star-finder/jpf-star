grammar DataNode;

@header {
package star.data;

import star.formula.*;
}

// parser
datas returns [DataNode[] dns] :
	data
	{
		$dns = new DataNode[1];
		$dns[0] = $data.dn;
	}
	| data tail
	{
		int length = $tail.dns.length + 1;
		$dns = new DataNode[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) $dns[0] = $data.dn;
			else $dns[i] = $tail.dns[i - 1];
		}
	}
;

tail returns [DataNode[] dns] :
	SM data
	{
		$dns = new DataNode[1];
		$dns[0] = $data.dn;
	}
	| SM data tail
	{
		int length = $tail.dns.length + 1;
		$dns = new DataNode[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) $dns[0] = $data.dn;
			else $dns[i] = $tail.dns[i - 1];
		}
	}
;

data returns [DataNode dn] :
	DATA ID LC RC
	{
		Variable[] fs = new Variable[0];
		$dn = new DataNode($ID.text, fs);
	}
	| DATA ID LC fields RC
	{
		Variable[] fs = $fields.fs;
		$dn = new DataNode($ID.text, fs);
	}
;

fields returns [Variable[] fs] :
	field
	{
		$fs = new Variable[1];
		$fs[0] = $field.f;
	}
	| field SM fields
	{
		int length = $fields.fs.length + 1;
		$fs = new Variable[length];
		
		for (int i = 0; i < length; i++) {
			if (i == 0) $fs[i] = $field.f;
			else $fs[i] = $fields.fs[i - 1];
		}
	}
;

field returns [Variable f] : type=ID name=ID
	{
		$f = new Variable($name.text, $type.text);
	}
;

// lexer
DATA    : 'data' ;
LC		: '{';
RC		: '}';
SM      : ';' ;
DOT		: '.';
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
WS      : [ \t\r\n]+ -> skip ;
