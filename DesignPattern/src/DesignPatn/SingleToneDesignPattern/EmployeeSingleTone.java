package DesignPatn.SingleToneDesignPattern;

public class EmployeeSingleTone {
    private static EmployeeSingleTone instance;

    static {
        instance = new EmployeeSingleTone();
    }

    private EmployeeSingleTone(){
        System.out.println("private const");
    }

    public static EmployeeSingleTone getInstance(){
        return instance;
    }
}
