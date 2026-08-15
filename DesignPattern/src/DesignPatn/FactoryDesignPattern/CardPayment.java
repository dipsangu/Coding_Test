package DesignPatn.FactoryDesignPattern;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Card payment done "+amount);
    }
}
