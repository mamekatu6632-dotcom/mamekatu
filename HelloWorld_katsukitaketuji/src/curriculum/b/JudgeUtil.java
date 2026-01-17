package curriculum.b;


public class JudgeUtil {

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void printEvenOdd(int num) {
		if (isEven(num)) {
			System.out.println(num + "は偶数です");
		} else {
			System.out.println(num + "は奇数です");
		}
	}
}