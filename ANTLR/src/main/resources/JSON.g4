grammar JSON;

json:object
    |array
    ;
object
 : '{' pair (',' pair)* '}'  #AnObject
 |'{' '}'                    #EmptyObject
 ;

pair:STRING ':' value;

array: '[' value (','value)* ']'  # ArrayOfValue
    |'[' ']'                      #EmptyArray
    ;
value :
       STRING  #String
       |NUMBER #Atom
       |object #ObjectValue
       |array  #arrayValue
       |'true' #Atom
       |'false' #Atom
       |'null' #Atom
       ;
STRING:'"'(ESC|~["\\])* '"';
fragment
ESC: '\\' (["\\/bfnrt]|UNICODE);
fragment  UNICODE: 'u' HEX HEX HEX HEX;
fragment  HEX :[0-9a-fA-F];

NUMBER:  '-'? INT '-' INT EXP?
 |'-'? INT EXP
 |'-'? INT
 ;
 fragment INT :'0' | [1-9][0-9]*; //除去0外的数字不允许0开始
 fragment EXP : [Ee] [+\-]? INT;// \- 是对-的转义， [...] 中的 -用于表达范围语义
 WS: [ \t\r\n]+ ->skip;

