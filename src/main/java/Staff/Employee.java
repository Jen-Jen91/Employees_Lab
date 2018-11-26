package Staff;

public class Employee {

    private String name;
    private int NINumber;
    private double salary;

    public Employee(String name, int NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNINumber() {
        return this.NINumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public double payBonus() {
        return this.salary/100;
    }

}
