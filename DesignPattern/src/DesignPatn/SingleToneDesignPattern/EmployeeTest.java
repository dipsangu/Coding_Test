package DesignPatn.SingleToneDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EmployeeTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EmployeeSingleTone e1= EmployeeSingleTone.getInstance();

        //Using reflection API to break the singleTone class
        Constructor<EmployeeSingleTone> declaredConstructor =
                EmployeeSingleTone.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        EmployeeSingleTone e2 = declaredConstructor.newInstance();
        // EmployeeSingleTone e2 = EmployeeSingleTone.getInstance();
       if(e1==e2){
           System.out.println("SingleTone");
       }else{
           System.out.println("Not");
        }
    }
}
