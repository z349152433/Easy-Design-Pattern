public class TextProxy {
    public static void main(String[] args) {
        Girl jiao=new Girl("娇娇");

        Proxy daili=new Proxy(jiao);

        daili.giveChocolate();
        daili.giveDolls();
        daili.giveFlowers();
    }
}
