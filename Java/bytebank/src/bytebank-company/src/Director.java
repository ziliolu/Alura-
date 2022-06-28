public class Director extends Employee{
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }
    public double getBonus(){
        System.out.println("Director getBonus() method");
        return super.getSalary() + 500;
    }

    public String getCountry(){
        return this.country;
    }
}
