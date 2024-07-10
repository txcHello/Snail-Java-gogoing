grammar  MyANTLR;


//1.匹配标识符
ID:('a'..'z')|('A'..'Z')+; //匹配一个或多个大小写字母
//ID:[a-zA-Z]+ ;  //匹配一个或多个大小写字母
//2.匹配数字
FLOAT: DIGINT+ '.'DIGINT*   // 匹配  1.  23. 3.1415926
 |'.' DIGINT    // 匹配  .1   .14159
 ;
fragment
DIGINT: [0-9] ;  //匹配单个数字   fragment 告诉 ANTLR  该规则本身不是一个词法符号,它只会被其他的词法规则使用,不能在文法规则中使用;
//3.匹配字符串常量

STRING:'"' .*? '"';  //匹配 "..." 间的任意文本  .号通配符 匹配任意的单个字符。  .* 就是循环 匹配零个或多个字符组成的任意字符串序列
STRING1: '"' (ESC|.)*'"';

fragment
ESC:'\\"'|'\\\\';
//4.匹配注释和空白字符
assign: ID (WS|COMMENT)? '=' (WS|COMMENT)? expr (WS|COMMENT) ? ;
LINE_COMMENT : '//'  .*? '/r'?  '\n'  ->skip ;
COMMENT:  '/*'  .*?  '*/' -> skip ;
WS:(' ' | '\t' |'\r'|'\n')  ->skip ;  //匹配一个或多个空白字符并将他们丢弃
WS1:[ \t\n\r]+ ->skip;  //匹配一个或多个空白字符并将他们丢弃
// 在词法规则和文法规则之间并不总是存在清晰界限，ANTLR对语法规则施加了限制

