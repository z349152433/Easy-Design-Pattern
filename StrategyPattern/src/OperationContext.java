public class OperationContext {
    Operation oper=null;

    public OperationContext(String type) {
        switch (type){
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
    }

    public void setNumberA(double numberA){
        oper.setNumberA(numberA);
    }

    public void setNumberB(double numberB){
        oper.setNumberB(numberB);
    }

    public double getResult(){
        return oper.getResult();
    }
}
