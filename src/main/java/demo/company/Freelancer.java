package demo.company;

public class Freelancer implements Developer{
    private String name;
    private double hourlyRate;

    public Freelancer(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void implementFeatures() {
        System.out.println("Implement features as a freelancer");
    }

    @Override
    public void solveBugs() {
        System.out.println("Solve bugs as a freelancer");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("Write documentation as a freelancer");
    }
}
