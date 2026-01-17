package curriculum.h;

public class Main {

	public static void main(String[] args) {
		 Employee fullTime = new FullTimeEmployee("E001", "正社員");
	        Employee partTime = new PartTimeEmployee("P001", "パート");

	        int hours = 9;

	        System.out.println("正社員の給与: " 
	                + fullTime.calculateDailyWage(hours) + " 円");
	        System.out.println("パート社員の給与: " 
	                + partTime.calculateDailyWage(hours) + " 円");

	}

}
