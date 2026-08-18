package Concepts_oops;

public class StudentAB extends StudentA{
    @Override
    public void Ama() {
        System.out.println("StudentAB Ama");
    }

    public static void main(String[] args) {
        StudentA a = new StudentAB();
        a.study();
        a.Ama();
    }
}
