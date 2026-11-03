public class CreditPayment implements Payment {
    @Override
    public void pay(double money){
        IO.println(String.format("Paid "+money+" Baht using Credit Crad."));
        IO.println(String.format("get point for Cash back. \n"));
    }
}
