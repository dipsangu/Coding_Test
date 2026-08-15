package DesignPatn.FactoryDesignPattern;

public class PaymentFactory {
    public static Payment createPayment(String paymentType){
        if(paymentType==null){
            throw new IllegalArgumentException("This payment is not exist");
        }
        switch (paymentType.toUpperCase()){
            case "UPI" : return new UpiPayment();
            case "CARD" : return new CardPayment();
            case "BANK" : return  new BankPayment();
            case "CASH" : return new CashPayment();
            default: throw new IllegalArgumentException("This paymnet type is not exist");
        }
    }
}
