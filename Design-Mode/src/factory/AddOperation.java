package factory;

/**
 * @Author Administrator
 * @Date 2023/2/2 15:12
 * @Version 1.0
 * Desc:
 */
public class AddOperation extends Operation{
    @Override
     public Double operate(double a, double b) {
        return a+b;
    }
}
