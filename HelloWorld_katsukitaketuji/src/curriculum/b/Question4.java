package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		int[] number1 = { 10, 20, 30, 40, 50 };
		for (int p = number1.length - 1; p >= 0; p--) {
			System.out.println(number1[p]);
		}
		int[] number3 = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int q = 0; q < number3.length; q++) {
			sum += number3[q];
			System.out.println(sum);
		}

		int[] number4 = { 12, 7, 9, 21, 5, 18 };

		int max = number4[0];
		int min = number4[0];

		for (int n : number4) {
			if (n > max)
				max = n;
			if (n < min)
				min = n;

		}
		System.out.println("最大値" + max);
		System.out.println("最小値" + min);

		int[] number5 = { 1, 2, 3, 4, 5 };
		int[] doubled = new int[number5.length];
		int index = 0;

		for (int n : number5) {
			doubled[index] = n * 2;
			System.out.println(doubled[index]);
			index++;

		}

		Scanner sc = new Scanner(System.in);

		int[] number6 = { 4, 7, 10, 15, 20 };
		String input;
		while (true) {
			System.out.print("数字を入力");
			input = sc.nextLine();
			int sum1 = Integer.parseInt(input);

			boolean found = false;
			for (int n : number6) {
				if (sum1 == n) {
					found = true;
					break;

				}
			}

			if (found) {
				System.out.println(+sum1 + "は配列に含まれています");
			} else {
				System.out.println(+sum1 + "は配列に含まれていません");
				break;
			}

		}

		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j] + "");
			}
			System.out.println();
		}

		int[][] array1 = { { 10, 20, 30, }, { 40, 50, 60 }, { 70, 80, 90 } };
		int sum2 = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int p = 0; p < array1[i].length; p++) {
				sum2 += array1[i][p];
			}
		}
		System.out.println(sum2);

		int[][] array2 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		int max1 = array2[0][0];
		int min1 = array2[0][0];
		for (int[] row : array2) {
			for (int n : row) {
				if (n > max1) {
					max1 = n;
				}
				if (n < min1) {

					min1 = n;
				}

			}

		}
		System.out.println("最大" + max1);
		System.out.println("最小" + min1);

		int[][][] array3 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6, }, { 7, 8 } } };
		for (int[][] plane : array3) {
			for (int[] row : plane) {
				for (int n : row) {
					System.out.println(n);
				}
			}
		}

	}
}
