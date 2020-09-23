//工厂类根据运算符new具体的Operation对象并返回
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation oper=null;
        switch (operate){
            case "+":
                oper=new OperationAdd();
                break;
            case "-":
                oper=new OperationSub();
                break;
            case "*":
                oper=new OperationMul();
                break;
            case "/":
                oper=new OperationDiv();
                break;
        }
        return oper;
    }
}
