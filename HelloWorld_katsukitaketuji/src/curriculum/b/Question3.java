package curriculum.b;

import java.util.Random;
import java.util.Scanner;



public class Question3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int x = 2; x <= 20; x += 2) {
			System.out.println(x);
		}
		for (int y = 10; y >= 1; y -= 1) {
			System.out.println(y);
		}

		int sum = 0;
		for (int z = 1; z <= 100; z++) {
			sum += z;

		}
		System.out.println(sum);

		for (int p = 1; p <= 5; p++) {
			for (int q = 1; q <= p; q++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		int count2 = 2;
		while (count2 <= 20) {
			System.out.println(count2);
			count2 += 2;
		}

		int count3 = 10;
		while (count3 >= 1) {
			System.out.println(count3);
			count3--;
		}
		int count4 = 1;
		int num = 0;
		while (count4 <= 100) {
			num += count4;
			count4++;
		}
		System.out.println(num);

		Scanner sc = new Scanner(System.in);
		
	
		String input;
		while (true) {
			System.out.print("数値を入力");
			input = sc.nextLine();
			int sum1 = Integer.parseInt(input);
			if (sum1 == 0) {
				System.out.println("終了しました");
				break;
			}

		}
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.printf("%02d * %02d = %02d ||", a, b, a * b);

			}
			System.out.println();

		}
		
		Random rand = new Random();
		
		System.out.print("商品名を入力");
		String input2 = sc.nextLine();
		String[] items = input2.split("、");
		
		

		for (String item : items) {
			int tv = rand.nextInt(12);
			int display = 11 - tv;

			switch (item) {

			case "テレビ":
			case "ディスプレイ":
				System.out.println(
						item + "残りの台数は" + (item.equals("テレビ") ? tv : display) + "台です");
				break;

			case "パソコン":
				System.out.println("パソコンの残り台数は" + rand.nextInt(12) + "台です");
				break;

			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + rand.nextInt(12) + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + rand.nextInt(12) + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + rand.nextInt(12) + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + rand.nextInt(12) + "台です");
				break;
			default:
				System.out.println("『" + item + "』は指定の商品ではありません");

			}
		}
		sc.close();

	}
}
