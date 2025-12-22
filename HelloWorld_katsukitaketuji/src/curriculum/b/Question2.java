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

		int num = sc.nextInt();
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

		int value = sc.nextInt();
		{

			if (value % 2 == 0) {
				System.out.println("偶数です");
			} else

			{
				System.out.println("奇数です");
			}
			
		}
		System.out.println("0から100のいずれかの値を代入");
		int Score = sc.nextInt();
		
			if (Score >= 90) {
				System.out.println("優");
			} else if(Score <= 90 && Score >= 70){
				System.out.println("良");
			}else if (Score <= 70 && Score >= 50) {
				System.out.println("可");
			}else if ( Score < 50);{
				System.out.println("不可");
			}
			
			
		System.out.println("文字を入力してください");
		 String imput = sc.nextLine();
		 
		 if(imput == null || imput.isEmpty()) {
			 System.out.println("入力が無効です");
		 }else {
			 System.out.println(imput);
		 }
		 sc.close();
	}
}


		
		
	
