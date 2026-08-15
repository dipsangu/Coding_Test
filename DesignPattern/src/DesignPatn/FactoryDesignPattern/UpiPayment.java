package DesignPatn.FactoryDesignPattern;

public class UpiPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Upi payment done "+amount);
    }
}
