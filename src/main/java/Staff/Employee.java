package Staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    protected double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        if (newName != null && newName != "") {
            this.name = newName;
        }
    }

    public String getNINumber() {
        return this.NINumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary/100;
    }

}
