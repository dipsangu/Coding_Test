package DesignPatn.BuilderDesignPattern;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee.EmployeeBuilder()
                .salary(10000)
                .name("Sangram")
                .location("Bengalure")
                .id(101)
                .build();
        System.out.println(emp);
    }
}
