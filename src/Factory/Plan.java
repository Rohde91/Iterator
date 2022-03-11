package Factory;

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
    //public grundet at den er kendt i main og er fælles for alle underklasserne
}//end of Plan class.
