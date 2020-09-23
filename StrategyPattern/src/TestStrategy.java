public class TestStrategy {
    public static void main(String[] args) {
        OperationContext oc=new OperationContext("+");
        oc.setNumberA(1);
        oc.setNumberB(2);
        System.out.println(oc.getResult());
    }
}
