package test;

import antlr.ArrayIntBaseListener;
import antlr.ArrayIntParser;

/**
 * @Author Administrator
 * @Date 2023/5/22 10:30
 * @Version 1.0
 * Desc:
 */
public class ShortToUnicodeString extends ArrayIntBaseListener {
    //将{ 翻译为 "
    @Override
    public void enterArr(ArrayIntParser.ArrContext ctx) {
        System.out.println('"');
    }

    // 将 } 翻译为 "
    @Override
    public void exitArr(ArrayIntParser.ArrContext ctx) {
        System.out.println('"');
    }

    @Override
    public void enterValue(ArrayIntParser.ValueContext ctx) {
        //从上下文对象获取INT词法符号对应的整数值
        int i = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x",i);
    }
}
