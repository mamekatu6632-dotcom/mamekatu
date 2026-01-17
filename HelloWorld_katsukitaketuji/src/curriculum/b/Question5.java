package curriculum.b;

public class Question5 {
	public static void main(String[] args) {

		HelloUtil.helloWorld();

		int value = 10;
		int result = CalcUtil.doubleValue(value);
		System.out.println(value + "を２倍すると" + result + "です");

		int num1 = 7;
		int num2 = 10;

		JudgeUtil.printEvenOdd(num1);
		JudgeUtil.printEvenOdd(num2);

		Greeting.sayHello();

		Animal lion = new Animal();
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength());
		System.out.println("速度：" + lion.getSpeed());
	}
}
