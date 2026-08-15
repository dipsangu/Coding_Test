package DesignPatn.FactoryDesignPattern;

public class PaymnetService {
    public void processPayment(String paymentType, double amount){
        Payment payment=PaymentFactory.createPayment(paymentType);
        payment.pay(amount);
    }

}
