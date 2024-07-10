grammar ip;

//需求 统计文件行数
//file: NL; //匹配换行符的语法分析器
//STUFF: ~'\n'+ ->skip; //除'\n'之外的字符全部丢弃
//NL: '\n'; // 将设定的换行符 返回给语法分析器或者其他的调用者


//从日志文件中提取ip地址

//IP : INT '.' INT '.'INT '.'INT;
//INT:[0-9]+;
//STRING : '"'  .*?  '"';
//NL : '\n';
//WS : ' ' ->skip;

// 构造匹配日志文件中的全部记录的文法规则


//file: row+;   //匹配日志文件全部行的语法规则
//row : IP  STRING INT  NL; //匹配文件中一行记录  IP词法 整个传给语法分析器，通过split 处理
//IP : INT '.' INT '.'INT '.'INT;
//INT:[0-9]+;
//STRING : '"'  .*?  '"';
//NL : '\n';
//WS : ' ' ->skip;
file: row+;   //匹配日志文件全部行的语法规则
row : ip  STRING INT  NL; //匹配文件中一行记录
ip : INT '.' INT '.'INT '.'INT;    // 令词法分析器
INT:[0-9]+;
STRING : '"'  .*?  '"';  //
NL : '\n';   //匹配一行记录终止符
WS : ' ' ->skip;  //忽略空格
