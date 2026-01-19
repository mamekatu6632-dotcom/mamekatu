package selfintroduction;

class Person {

	String name;
	int age;
	double height;
	double weight;

	static int count = 0;

	double bmi() {
		return weight / (height * height);
	}

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		count++;

	}

	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
		System.out.println("合計" + count + "人です");
	}
}
