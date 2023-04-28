package test;

import antlr.DslLexer;
import antlr.DslParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @Author Administrator
 * @Date 2022/12/30 15:51
 * @Version 1.0
 * Desc:
 */
public class DslANTLRDemo {
    public static void main(String[] args) {
        String sql= "Select 'abc' as a, `hahah` as c  From a aS table;";
        ANTLRInputStream input = new ANTLRInputStream(sql);  //将输入转成antlr的input流
        DslLexer lexer = new DslLexer(input);  //词法分析
        CommonTokenStream tokens = new CommonTokenStream(lexer);  //转成token流
        DslParser parser = new DslParser(tokens); // 语法分析
        DslParser.StaContext tree = parser.sta();  //获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......
        System.out.println(tree.toStringTree(parser)); //打印规则数
    }
}
