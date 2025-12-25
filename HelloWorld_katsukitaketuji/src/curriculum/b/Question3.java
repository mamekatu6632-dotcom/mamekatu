package curriculum.b;

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

	}
}
