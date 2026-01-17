package curriculum.k;

public class FullTimeEmployee extends Employee {

    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public int calculateSalary(int hours) {
        return hours * HOURLY_RATE;
    }
}