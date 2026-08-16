package Concepts_oops;

public class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public  Employee(){

        System.out.println("Parent Constructor");
    }
    public static void m1(){
        System.out.println("Parent static method");
    }
    public  void m2(){
        System.out.println("Parent Instance Method m2");
    }
    static {
        System.out.println("parent static block");
    }
}
