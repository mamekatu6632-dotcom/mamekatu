package curriculum.k;

public class SalaryReporter {
	public void printSalary(Employee e, int hours) {
		System.out.println(
				e.getName() + " の給料は " + e.calculateSalary(hours) + " 円");
	}
}