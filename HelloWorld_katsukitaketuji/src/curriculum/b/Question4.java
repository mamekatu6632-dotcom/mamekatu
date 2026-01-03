package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/*int[] number = {1, 2, 3, 4, 5};		
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
		}*/

		/*int[] number = { 12, 7, 9, 21, 5, 18 };
		
			int max = number[0];
			int min = number[0];
		
			for (int n : number) {
				if (n > max)
					max = n;
				if (n < min)
					min = n;
		
			}
			System.out.println("最大値" + max);
			System.out.println("最小値" + min);*/

		/*int[] number = { 1, 2, 3, 4, 5 };
		int[] doubled = new int[number.length];
		int index = 0;
		
		for (int n : number) {
			doubled[index] = n * 2;
			System.out.println(doubled[index]);
			index++;
			
		}*/

		Scanner sc = new Scanner(System.in);

		int[] number = { 4, 7, 10, 15, 20 };
		String input;
		while (true) {
			System.out.print("数字を入力");
			input = sc.nextLine();
			int sum = Integer.parseInt(input);

			boolean found = false;
			for (int n : number) {
				if (sum == n) {
					found = true;
					break;

				}
			}

			if (found) {
				System.out.println(+sum + "は配列に含まれています");
			} else {
				System.out.println(+sum + "は配列に含まれていません");
			}

		}
	}

}
