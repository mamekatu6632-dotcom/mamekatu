package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Billable> list = new ArrayList<>();

		list.add(new FullTimeEmployee("F001", "正社員A"));
		list.add(new ContractEmployee("C001", "契約社員A"));
		list.add(new FullTimeEmployee("F002", "正社員B"));

		for (Billable b : list) {
			System.out.println("日給: " + b.costForDay(9) + " 円");
		}
	}
}