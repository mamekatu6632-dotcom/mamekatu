package curriculum.c;

import java.util.Scanner;

public class Player {

	private Scanner scanner;

	public Player(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getHand() {
		while (true) {
			System.out.print("グー(0), チョキ(1), パー(2) を入力: ");

			if (scanner.hasNextInt()) {
				int hand = scanner.nextInt();

				if (hand >= 0 && hand <= 2) {
					return hand;
				} else {
					System.out.println("0〜2の数字を入力してください。");
				}
			} else {
				System.out.println("数字を入力してください。");
				scanner.next();
			}
		}
	}
}