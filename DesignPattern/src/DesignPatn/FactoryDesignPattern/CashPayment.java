package DesignPatn.FactoryDesignPattern;

public class CashPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Cash payment Done "+amount);
    }
}
