package DesignPatn.FactoryDesignPattern;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter payment type");
        String paymentType=sc.next();
        System.out.println("Enter  the amount");
        double amount = sc.nextFloat();
        new PaymnetService().processPayment(paymentType,amount);

    }
}
