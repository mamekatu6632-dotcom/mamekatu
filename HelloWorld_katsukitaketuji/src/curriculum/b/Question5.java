package curriculum.b;

public class Question5 {

	/*public static void helloWorld() {
		System.out.println("Hello,World");
	}
	
	public static void main(String[] args) {
		helloWorld();
	
	}*/

	/*public static int doubleValue(int num) {
		return num * 2;
	}
	
	public static void main(String[] args) {
		int value = 10;
		int result = doubleValue(value);
	
		System.out.println(value + "を２倍すると" + result + "です");
	}*/

	/*public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 10;
		if (isEven(num1)) {
			System.out.println(num1 + "偶数です");
		} else {
			System.out.println(num1 + "奇数です");
		}
		if (isEven(num2)) {
			System.out.println(num2 + "偶数です");
		} else {
			System.out.println(num2 + "奇数です");
		}
	
	}*/
	/*class Greeting {
		public static void sayHello() {
			System.out.println("こんにちは！");
		}
	}
	
	class main {
		public static void main(String[] args) {
			Greeting.sayHello();
		}
	
	}*/}

class Animal {
	private String name;
	private double length;
	private int speed;

	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public double getLength() {
		return length;
	}

	public int getSpeed() {
		return speed;
	}
}

class main {
	public static void main(String[] args) {
		Animal lion = new Animal();

		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		System.out.println("動物名" + lion.getName());
		System.out.println("体長" + lion.getLength());
		System.out.println("速度" + lion.getSpeed());
	}
}
