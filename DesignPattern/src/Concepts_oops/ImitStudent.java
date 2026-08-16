package Concepts_oops;

public class ImitStudent extends Student{
    @Override
    public void studyFees() {
        System.out.println("Student fees is 1000pm");
    }

    public static void main(String[] args) {


        Student student = new ImitStudent();
        //We can not create the object of abstract class
       // Student st = new Student()  It is showing student is a abstract class can not be instantiated

    }
}
