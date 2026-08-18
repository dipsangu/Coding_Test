package Concepts_oops;

public class StudentCD implements StudentC,StudentD{
    @Override
    public void m1() {
        System.out.println("cdm1");
    }

    @Override
    public void m2() {
        System.out.println("cdm2");
    }

    public static void main(String[] args) {
        StudentC c = new StudentCD();
       // StudentC c1= new StudentC();// Wont allow

        c.m1();
        c.m2();

    }
}
