package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Player名を入力してください: ");
		Player player = new Player(sc.nextLine());

		Daemon daemon = new Daemon("daemon_status.txt");

		FileWriter log = new FileWriter("battle_log.txt");

		log.write(status(player));
		log.write(status(daemon));

		Character first, second;

		if (player.sp > daemon.sp) {
			first = player;
			second = daemon;
		} else if (player.sp < daemon.sp) {
			first = daemon;
			second = player;
		} else {
			if (new Random().nextBoolean()) {
				first = player;
				second = daemon;
			} else {
				first = daemon;
				second = player;
			}
		}

		log.write("\n先攻: " + first.name + "\n\n");

		while (player.isAlive() && daemon.isAlive()) {
			first.attack(second);
			log.write(first.name + " の攻撃 \n");
			log.write(status(second));

			if (!second.isAlive())
				break;

			second.attack(first);
			log.write(second.name + " の攻撃 \n");
			log.write(status(first));
		}

		log.write("\n 終了 \n");
		log.write(player.isAlive() ? "勝者: " + player.name : "勝者: " + daemon.name);

		log.close();
		sc.close();
	}

	private static String status(Character c) {
		return String.format("%s [HP=%d AT=%d SP=%d]\n", c.name, c.hp, c.at, c.sp);
	}
}