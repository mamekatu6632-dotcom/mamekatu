package curriculum.b;

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

		/*Scanner sc = new Scanner(System.in);
		
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
		
		}*/

		/*int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for(int i = 0;i < array.length;i++) {
			for(int j =0; j<array[i].length;j++) {
				System.out.println(array[i][j]+"");
			}
			System.out.println();
		}*/

		/*int[][] array = { { 10, 20, 30, }, { 40, 50, 60 }, { 70, 80, 90 } };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int p = 0; p < array[i].length; p++) {
				sum += array[i][p];
			}
		}
		System.out.println(sum);*/

		/*int[][] array = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		int max = array[0][0];
		int min = array[0][0];
		for (int[] row : array) {
			for (int n : row) {
				if (n > max) {
					max = n;
				}
				if (n < min) {

					min = n;
				}

			}

		}
		System.out.println("最大"+max);
		System.out.println("最小"+min);*/
		
		int[][][]array = {{{1,2},{3,4}},{{5,6,},{7,8}}};
		for(int[][] plane : array) {
			for(int[] row : plane) {
				for(int n : row) {
					System.out.println(n);
				}
			}
		}
		
	}
}
