package Concepts_oops;

public class EmpChield extends Employee {

    public EmpChield(){
        System.out.println("Child Constructor");
    }
    public static void m1(){
        System.out.println("E");
    }
    public void m2(){
        System.out.println("Child instance Method m2");
    }
    static {
        System.out.println("Child static block");
    }

    public static void main(String[] args) {
/*        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Sangram");
        System.out.println(employee);*/
        Employee e= new EmpChield();
        e.m1();
        e.m2();
        EmpChield e2= new EmpChield();
        e2.m1();// Then only call to the child class static method
    }
    
}
