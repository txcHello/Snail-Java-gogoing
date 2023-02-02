package factory;

/**
 * @Author Administrator
 * @Date 2023/2/2 15:37
 * @Version 1.0
 * Desc:
 */
public class FactoryOperation {
   private  static Operation  ope = null;

    public static Operation getOpe(String opeS) {
        switch (opeS){
            case "+":
             ope =  new AddOperation();
             break;
            case "-":
                ope = new SubOperation();
                break;
        }
        return ope;
    }
}
