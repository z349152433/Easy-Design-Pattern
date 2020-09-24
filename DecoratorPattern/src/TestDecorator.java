public class TestDecorator {
    public static void main(String[] args) {
        //new一个人
        Person led=new Person("led");
        //new装扮
        Finery ts=new TShirts();
        Finery bt=new BigTrouser();
        Finery bt2=new BigTrouser();
        System.out.println("第一种装扮");
        //装扮并打印
        bt.Decorate(led);
        ts.Decorate(bt);
        ts.show();

        System.out.println("第二种装扮");
        //装扮并打印
        ts.Decorate(led);
        bt.Decorate(ts);
        bt.show();

        System.out.println("第三种装扮");
        //装扮并打印
        bt.Decorate(led);
        bt2.Decorate(bt);
        bt2.show();
    }
}
