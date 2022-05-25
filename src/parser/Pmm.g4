grammar Pmm;

@header{
import ast.definition.*;
import ast.expression.*;
import ast.expression.literal.*;
import ast.expression.operator.*;
import ast.statement.*;
import ast.type.*;
import ast.type.complexTypes.*;
import ast.type.sympleTypes.*;
import ast.*;
import java.util.*;
import symboltable.*;
}

program returns [Program ast] locals[List<Definition> defs =  new ArrayList<>()]:
                (def1=def {$defs.addAll($def1.ast);})* mainProgam=main EOF {$defs.add($mainProgam.ast);}{$ast = new Program($defs);}
                ;

main returns [FuncDefinition ast]:
            OP1='def' 'main' '(' ')' ':' cuerpoMain=inBody {$ast = new FuncDefinition($OP1.getCharPositionInLine()+1, $OP1.getLine(),"main", new FunctionType($OP1.getCharPositionInLine()+1, $OP1.getLine(), "main", new ArrayList<VarDefinition>(), VoidType.getInstance($OP1.getCharPositionInLine()+1, $OP1.getLine())), $cuerpoMain.ast);}
            ;

def returns [List<Definition> ast =  new ArrayList<>()]:
            defVar=defVaribales {$ast.addAll($defVar.ast);}
            | defFunc=defFunction {$ast.addAll($defFunc.ast);}
            ;

defVaribales returns [List<VarDefinition> ast =  new ArrayList<>()] locals [List<String> idList =  new ArrayList<>(),List<String> common =  new ArrayList<>(), Expression expr = null ]:
                    OP1=ID {$idList.add($OP1.text);} (',' OP2=ID {$idList.add($OP2.text);})* ':' type=tipo ('=' expression {$expr = $expression.ast;})?';' {for(String elem : $idList) { if(!$common.contains(elem)){ $ast.add(new VarDefinition($OP1.getCharPositionInLine()+1, $OP1.getLine(), elem, $type.ast, $expr)); $common.add(elem);}else{new ErrorType($OP1.getCharPositionInLine()+1, $OP1.getLine(), "The variable named " + elem + " is already being used");} } }
                    ;

defFunction returns [List<FuncDefinition> ast =  new ArrayList<>()] :
                (aux=functionType cuerpo=inBody {$ast.add(new FuncDefinition($functionType.ast.getColumn(),$functionType.ast.getLine(),$aux.ast.getName(), $aux.ast ,$cuerpo.ast));})+
                ;

functionType returns [FunctionType ast] locals [Type tipoFunc = VoidType.getInstance(0,0), List<VarDefinition> parameter =  new ArrayList<>()]:
                'def' OP=ID '(' var=functionTypeParametersAux ')' ':' (type=tipoSimple {$tipoFunc = $type.ast;})? {$ast =  new FunctionType($OP.getCharPositionInLine()+1, $OP.getLine(), $OP.text, $var.ast, $tipoFunc);}
                ;

functionTypeParametersAux returns [List<VarDefinition> ast =  new ArrayList<>()]:
                                (OP1=ID ':' type1=tipoSimple {$ast.add(new VarDefinition($OP1.getCharPositionInLine()+1, $OP1.getLine(), $OP1.text,$type1.ast, null));} (',' OP2=ID ':' type2=tipoSimple {$ast.add(new VarDefinition($OP2.getCharPositionInLine()+1, $OP2.getLine(), $OP2.text,$type2.ast,null));})* )*
                                ;

tipo returns [Type ast] locals [List<RecordField> fields =  new ArrayList<>()]  :
                | type1=tipoSimple {$ast=$type1.ast;}
                |  OP1='struct' '{' (op1=recordField {$fields.addAll($op1.ast);} )+ '}' {$ast= new Struct($OP1.getCharPositionInLine()+1, $OP1.getLine(), $fields);} {((Struct)$ast).CheckErrors();}
                | '['INT_CONSTANT']' of=tipo {$ast = new ArrayType($INT_CONSTANT.getCharPositionInLine()+1, $INT_CONSTANT.getLine(), LexerHelper.lexemeToInt($INT_CONSTANT.text) , $of.ast);}
                ;

tipoSimple returns [Type ast]:
                 TYPE='char' {$ast = CharType.getInstance($TYPE.getCharPositionInLine()+1, $TYPE.getLine());}
                | TYPE='double' {$ast = DoubleType.getInstance($TYPE.getCharPositionInLine()+1, $TYPE.getLine());}
                | TYPE='int' {$ast = IntType.getInstance($TYPE.getCharPositionInLine()+1, $TYPE.getLine());}
                ;

recordField returns [List<RecordField> ast =  new ArrayList<>()] locals [List<String> fields =  new ArrayList<>()] :
                    OP1=ID{$fields.add($OP1.text);} (',' OP2=ID {$fields.add($OP2.text);})* ':' type=tipo ';' {for(String elem : $fields) { $ast.add(new RecordField($OP1.getCharPositionInLine()+1, $OP1.getLine(),elem, $type.ast));}}
                    ;

statement returns [Statement ast] locals [List<Expression> param =  new ArrayList<>(), List<Expression> parameter =  new ArrayList<>(), List<Statement> elses =  new ArrayList<>()]:
                    'while' exprWhile=expression ':' cuerpo=statementbody {$ast = new Iterative($exprWhile.ast.getColumn(), $exprWhile.ast.getLine(), $exprWhile.ast, $cuerpo.ast);}
                   | 'if' exprIf=expression ':' stateIf=statementbody ('else' statelse=statementbody{$elses = $statelse.ast;})? {$ast= new Condition($exprIf.ast.getColumn(), $exprIf.ast.getLine(), $exprIf.ast, $stateIf.ast, $elses);}
                   | AUX='switch' '(' expression ')' '{' swtichbody  DEFA='default' ':' defState=statement temporal '}' {$ast = new Switch($AUX.getCharPositionInLine()+1, $AUX.getLine(), $expression.ast, $swtichbody.ast, new Case($DEFA.getCharPositionInLine()+1, $DEFA.getLine(), null, $defState.ast, $temporal.ast)) ;}
                   | 'return' stat3=expression ';' {$ast = new Return($stat3.ast.getColumn(), $stat3.ast.getLine(), $stat3.ast);}
                   | AUX='input' stateRead=listExpression ';'{$ast = new Read($AUX.getCharPositionInLine()+1, $AUX.getLine(), $stateRead.ast);}
                   | AUX='print' stateWrite=listExpression ';'{$ast = new Write($AUX.getCharPositionInLine()+1, $AUX.getLine(), $stateWrite.ast);}
                   | left=expression ('=') right=expression ';' {$ast = new Assigmment($left.ast.getColumn(), $left.ast.getLine(), $left.ast, $right.ast);}
                   | ID '('(expr1=listExpression{$parameter = $expr1.ast;})*')'';' {$param.addAll($parameter);} {$ast = new FunctionInvoke($ID.getCharPositionInLine()+1, $ID.getLine(), $param, new Variable($ID.getCharPositionInLine()+1, $ID.getLine(), $ID.text));}
                   ;

swtichbody returns [List<Case> ast =  new ArrayList<>()]:
            (AUX='case' expression ':' statement temporal {$ast.add(new Case($AUX.getCharPositionInLine()+1, $AUX.getLine(), $expression.ast, $statement.ast, $temporal.ast ));})+
            ;

temporal returns [String ast]:
        AUX='break' ';'  {$ast = $AUX.text;}
        | AUX='continue' ';'{$ast = $AUX.text;}
        ;

inBody returns [List<Statement> ast =  new ArrayList<>()] :
                '{' (sta1=defVaribales {$ast.addAll($sta1.ast);})* (sta2=statement {$ast.add($sta2.ast);})* '}'
                ;

statementbody returns [List<Statement> ast =  new ArrayList<>()]:
                    '{' (sta1=defVaribales {$ast.addAll($sta1.ast);})* (sta2=statement {$ast.add($sta2.ast);})* '}'
                    | stat1=statement {$ast.add($stat1.ast);}
                    ;

listExpression returns [List<Expression> ast =  new ArrayList<>()]:
                expr1=expression {$ast.add($expr1.ast);} (',' expr2=expression {$ast.add($expr2.ast);})*
                ;

 expression returns [Expression ast] locals [List<Expression> param =  new ArrayList<>()]:
              INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getCharPositionInLine()+1, $INT_CONSTANT.getLine(), LexerHelper.lexemeToInt($INT_CONSTANT.text) );}
            | REAL_CONSTANT {$ast = new DoubleLiteral($REAL_CONSTANT.getCharPositionInLine()+1, $REAL_CONSTANT.getLine(), LexerHelper.lexemeToReal($REAL_CONSTANT.text) );}
            | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getCharPositionInLine()+1, $CHAR_CONSTANT.getLine(), LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
            | ID {$ast = new Variable($ID.getCharPositionInLine()+1, $ID.getLine(), $ID.text );}
            | '(' expr=expression ')' {$ast = $expr.ast;}
            | expr1=expression '[' expr2=expression ']' {$ast = new ArrayAccess( $expr1.ast.getColumn(), $expr1.ast.getLine(), $expr1.ast, $expr2.ast );}
            | field=expression '.' ID {$ast = new FieldAcess($field.ast.getColumn(),$field.ast.getLine() ,$field.ast, $ID.text );}
            | '(' type=tipo ')' expr=expression {$ast = new Cast($type.ast.getColumn(),$type.ast.getLine() , $expr.ast, $type.ast );}
            | '-' unary=expression {$ast = new UnaryMinus($unary.ast.getColumn(), $unary.ast.getLine(), $unary.ast);}
            | '!' exprNeg=expression {$ast = new Negative( $exprNeg.ast.getColumn(), $exprNeg.ast.getLine(), $exprNeg.ast);}
            | left=expression OP=('*' | '/' | '%') right=expression {$ast = new Aritmmetic($left.ast.getColumn(),$left.ast.getLine() ,$left.ast , $right.ast, $OP.text );}
            | left=expression OP=('+' | '-') right=expression {$ast = new Aritmmetic($left.ast.getColumn(),$left.ast.getLine() ,$left.ast , $right.ast, $OP.text );}
            | left=expression OP=('==' | '!=' | '>=' | '<' | '>' | '<=') right=expression {$ast = new Comparision($left.ast.getColumn(),$left.ast.getLine() ,$left.ast , $right.ast, $OP.text );}
            | left=expression OP=('&&' |'||') right=expression {$ast = new Logic($left.ast.getColumn(),$left.ast.getLine() ,$left.ast , $right.ast, $OP.text );}
            | ID '('(parameters=listExpression{$param.addAll($parameters.ast);})?')'  {$ast = new FunctionInvoke($ID.getCharPositionInLine()+1, $ID.getLine(), $param, new Variable($ID.getCharPositionInLine()+1, $ID.getLine(), $ID.text));}
           // | condition=expression '?' exprIf=expression  ':' exprElse=expression {$ast = new Ternaria($exprIf.ast.getColumn(), $exprIf.ast.getLine(), $exprIf.ast, $exprElse.ast, $condition.ast);}
            ;

INT_CONSTANT: [0-9]+ ;
//INT_CONSTANT: '0' | [1-9][0-9]* ;

CHAR_CONSTANT: '\'' . '\'' | '\'\\' ([0-9]+|'n'|'r'|'t'|' '|) '\'' | '\'' [0-9]+ '\'';

REAL_CONSTANT: NUMERIC_REAL_CONSTANT | (NUMERIC_REAL_CONSTANT | INT_CONSTANT) ('E'|'e')  ('+'|'-')?  INT_CONSTANT;

fragment
NUMERIC_REAL_CONSTANT: INT_CONSTANT '.' [0-9]* | '.' [0-9]+;

ID: ([a-zA-Z]|'_')[a-zA-Z0-9_]*   ;

//COMENTARIO: '#'~[\n].*? ('\n'|EOF)->skip;

COMENTARIO: '#'~[\n]* ('\n'|EOF)->skip;

COMENTARIO_COMILLAS: '"""'.*?'"""' ->skip;

TRASH: [ \n\t\r] -> skip;

