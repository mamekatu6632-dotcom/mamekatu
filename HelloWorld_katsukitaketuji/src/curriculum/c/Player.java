package curriculum.c;

import java.util.Scanner;

public class Player {

	private Scanner scanner;

	public Player(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getHand() {
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
		return scanner.nextInt();

	}
}