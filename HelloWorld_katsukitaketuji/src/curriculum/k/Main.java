package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("正社員A"));
		employees.add(new ContractEmployee("契約社員B"));

		SalaryReporter reporter = new SalaryReporter();

		for (Employee e : employees) {
			reporter.printSalary(e, 8);
		}
	}
}