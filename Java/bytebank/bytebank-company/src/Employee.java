public abstract class Employee {

    //attributes
    private String name;
    private String cpf;
    protected double salary;


    //constructor
    public Employee(){

    }

    //methods
    public abstract double getBonus();

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
