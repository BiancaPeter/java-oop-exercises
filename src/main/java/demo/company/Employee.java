package demo.company;

public class Employee implements Developer, Manager {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void implementFeatures() {
        System.out.println("Implement features as an employee");
    }

    @Override
    public void solveBugs() {
        System.out.println("Solve bugs as an employee");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("Write documentation as an employee");
    }

    @Override
    public void evaluatePeople() {
        System.out.println("Evaluating people");
    }

    @Override
    public void delegateTasks() {
        System.out.println("Delegating tasks");
    }
}
