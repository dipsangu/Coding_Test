package DesignPatn.BuilderDesignPattern;

public class Employee {
    private final String name;
    private final double id;
    private final String loaction;
    private final double salary;
    private final String skill;
    private final boolean remote;
    private final String exp;

    public Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.loaction = builder.loaction;
        this.salary = builder.salary;
        this.skill = builder.skill;
        this.remote = builder.remote;

        this.exp = builder.exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", loaction='" + loaction + '\'' +
                ", salary=" + salary +
                ", skill='" + skill + '\'' +
                ", remote=" + remote +
                '}';
    }

    public static class EmployeeBuilder {
        public String exp;
        private  String name;
        private  double id;
        private  String loaction;
        private  double salary;
        private  String skill;
        private  boolean remote;

       public EmployeeBuilder name(String name){
           this.name=name;
           return this;
       }
       public EmployeeBuilder id(double id){
           this.id=id;
           return this;
       }
       public EmployeeBuilder location(String loaction){
           this.loaction=loaction;
           return this;
       }
       public EmployeeBuilder salary(double salary){
           this.salary=salary;
           return this;
       }
       public EmployeeBuilder skill(String skill){
           this.skill=skill;
           return this;
       }
       public EmployeeBuilder remote(boolean remote){
           this.remote=remote;
           return this;
       }
       public Employee build(){
           return new  Employee(this);
       }
    }
}