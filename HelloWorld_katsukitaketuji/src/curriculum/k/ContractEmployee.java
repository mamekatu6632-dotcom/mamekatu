package curriculum.k;

public class ContractEmployee extends Employee {

    private static final int HOURLY_RATE = 1000;

    public ContractEmployee(String name) {
        super(name);
    }

    @Override
    public int calculateSalary(int hours) {
        return hours * HOURLY_RATE;
    }
}