package factory;


import java.util.Scanner;

/**
 * @Author Administrator
 * @Date 2022/10/21 17:19
 * @Version 1.0
 * Desc:  工厂模式
 */
public class OperationClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值:");
        double a = scanner.nextDouble();
        System.out.println("请输入第二个值：");
        double b = scanner.nextDouble();
        System.out.println("请输入运算符号：");
        String opr = scanner.next();
        System.out.println("结果是？");
        Operation operation = FactoryOperation.getOpe(opr);
        Double result = operation.operate(a, b);
        System.out.println("结果是:" + result);
    }
}
