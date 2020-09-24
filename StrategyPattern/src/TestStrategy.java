//和工厂模式相比，main方法中只涉及OperationContext类
public class TestStrategy {
    public static void main(String[] args) {
        OperationContext oc=new OperationContext("+");
        oc.setNumberA(1);
        oc.setNumberB(2);
        System.out.println(oc.getResult());
    }
}
