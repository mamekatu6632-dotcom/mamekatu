package curriculum.c;

public class Janken {

	public static void main(String[] args) {

		Player player = new Player();
		CPU cpu = new CPU();

		while (true) {
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();

			System.out.println("あなたの手: " + handToString(playerHand));
			System.out.println("CPUの手: " + handToString(cpuHand));

			int result = judge(playerHand, cpuHand);

			if (result == 1) {
				System.out.println("あなたの勝ち！");
				break;
			} else if (result == 0) {
				System.out.println("あいこです。");
			} else {
				System.out.println("あなたの負け。");
			}
		}
	}

	private static String handToString(int hand) {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "不正な値";
		}
	}

	private static int judge(int player, int cpu) {
		if (player == cpu) {
			return 0;
		}
		if ((player == 0 && cpu == 1) ||
				(player == 1 && cpu == 2) ||
				(player == 2 && cpu == 0)) {
			return 1;
		}
		return -1;
	}
}