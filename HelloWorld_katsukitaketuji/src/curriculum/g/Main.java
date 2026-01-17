package curriculum.g;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("田中花子");
		emp.setEmployeeId("E002");

		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getName());

	}
}
