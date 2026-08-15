package DesignPatn.SingleToneDesignPattern;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeSingleTone e1= EmployeeSingleTone.getInstance();
        EmployeeSingleTone e2 = EmployeeSingleTone.getInstance();
       if(e1.hashCode()==e2.hashCode()){
           System.out.println("SingleTone");
       }else{
           System.out.println("Not");
        }
    }
}
