package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です!");
		}

		int age = 25;
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}

		int age2 = 18;
		if (age2 >= 20) {
			System.out.println("成人です");

		} else if (age2 >= 13 && age2 <= 19) {
			System.out.println("ティーンエンジャーです");
		} else if (age2 <= 12) {
			System.out.println("子供です");
		}

		int x = 30;
		int y = 15;
		int z = 50;

		int big;

		if (x > y && x > z) {
			big = x;
		} else if (y > x && y > z) {
			big = y;
		} else {
			big = z;
		}
		System.out.println(big);

		Scanner sc = new Scanner(System.in);

		System.out.println("いずれかの値を代入");

		String input5 = sc.nextLine();

		if (!input5.trim().isEmpty()) {
			int num = Integer.parseInt(input5);

			{

				if (num > 0) {
					System.out.println("正の数です");
				} else if (num == 0) {
					System.out.println("0です");
				} else if (num < 0) {
					System.out.println("負の数です");
				}

			}

			System.out.println("いずれかの値を代入");

			String input6 = sc.nextLine();

			if (!input6.trim().isEmpty()) {
				int value = Integer.parseInt(input6);

				{

					if (value % 2 == 0) {
						System.out.println("偶数です");
					} else

					{
						System.out.println("奇数です");
					}

				}
				System.out.println("0から100のいずれかの値を代入");
				String input = sc.nextLine();

				if (!input.trim().isEmpty()) {
					int Score = Integer.parseInt(input);

					if (Score >= 90) {
						System.out.println("優");
					} else if (Score >= 70) {
						System.out.println("良");
					} else if (Score >= 50) {
						System.out.println("可");
					} else {
						System.out.println("不可");
					}

					System.out.println("文字を入力してください");
					String input1 = sc.nextLine();

					if (input1 == null || input1.isEmpty()) {
						System.out.println("入力が無効です");
					} else {
						System.out.println(input1);
					}

					String input2 = sc.nextLine();

					int day;

					day = Integer.parseInt(input2);

					switch (day) {
					case 1:
						System.out.println("今日は月曜日です");
						break;
					case 2:
						System.out.println("今日は火曜日です");
						break;
					case 3:
						System.out.println("今日は水曜日です");
						break;
					case 4:
						System.out.println("今日は木曜日です");
						break;
					case 5:
						System.out.println("今日は金曜日です");
						break;
					case 6:
						System.out.println("今日は土曜日です");
						break;
					case 7:
						System.out.println("今日は日曜日です");
						break;
					default:
						System.out.println("無効な入力です");

					}

					String input3 = sc.nextLine();

					int month;

					month = Integer.parseInt(input3);

					switch (month) {
					case 1:
					case 2:
					case 12:
						System.out.println("冬");
						break;
					case 3:
					case 4:
					case 5:
						System.out.println("春");
						break;
					case 6:
					case 7:
					case 8:
						System.out.println("夏");
						break;
					case 9:
					case 10:
					case 11:
						System.out.println("秋");
						break;
					default:
						System.out.println("無効な月です");
					}

					sc.close();

				}

			}
		}
	}
}