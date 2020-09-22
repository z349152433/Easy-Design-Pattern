public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if(getNumberB()==0)
           return 0.0000000001;
        return getNumberA()/getNumberB();
    }
}
