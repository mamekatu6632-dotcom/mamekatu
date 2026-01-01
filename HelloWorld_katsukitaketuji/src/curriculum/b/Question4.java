package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		
		int[] number = {1, 2, 3, 4, 5};		
		for(int i = 0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		int[] number1 = {10,20,30,40,50};
		for(int p = number1.length -1;  p >= 0; p--) {
			System.out.println(number1[p]);
		}
		int[] number3 = {3, 5, 7, 9, 11};
		int sum = 0;
		for(int q = 0; q < number3.length; q++) {
			sum += number3[q];
			System.out.println(sum);
		}
		
		
		
	}

}
