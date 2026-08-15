package DesignPatn.FactoryDesignPattern;

public class BankPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Bank payment done "+amount);
    }
}
