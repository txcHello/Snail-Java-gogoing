package test;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @Author Administrator
 * @Date 2023/5/13 0:17
 * @Version 1.0
 * Desc:
 */
public class Driver {
    public static void main(String[] args) {

//        String query = "1+2";
//        //对字符串 构造一个ANTLRStrean
//        ANTLRInputStream input = new ANTLRInputStream(query);
//        //构造词法解析器         词法解析器  将字符 聚集成单词或者符号
//        CalculatorLexer calculatorLexer = new CalculatorLexer(input);
//
//        //  用词法分析器 构造 一个记号流
//        CommonTokenStream    tokens =     new CommonTokenStream(calculatorLexer);
//        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
//        CalculatorParser parser = new CalculatorParser(tokens);
//        MyCalculatorVisitor myCalculatorVisitor = new MyCalculatorVisitor();
//        Object accept = parser.expr().accept(myCalculatorVisitor);
//        System.out.println(accept);

    }
}
