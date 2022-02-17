grammar Pmm;	

program: ;
  		 
INT_CONSTANT: '0' | [1-9][0-9]* ;

CHAR_CONSTANT: '\'' . '\'' | '\'\\' 'n' '\'' |'\'\\' 't' '\''|'\'\\' 'r' '\'' |'\'' ' ' '\'' | '\'\\' [0-9]+ '\'' | '\'' [0-9]+ '\'';

REAL_CONSTANT: NUMERIC_REAL_CONSTANT | (NUMERIC_REAL_CONSTANT | INT_CONSTANT) ('E'|'e')  ('+'|'-')?  INT_CONSTANT;

fragment
NUMERIC_REAL_CONSTANT: INT_CONSTANT '.' [0-9]* | '.' [0-9]+;

ID: [a-zA-Z][a-zA-Z0-9_]* | '_'+[a-zA-Z0-9_]*  ;

COMENTARIO: '#'~[\n]* ->skip;

COMENTARIO_COMILLAS: '"""'.*?'"""' ->skip;

TRASH: [ \n\t\r] -> skip;

