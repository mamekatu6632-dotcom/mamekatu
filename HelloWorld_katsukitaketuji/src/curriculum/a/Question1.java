package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum = 0; //byte型の変数　byteNum を宣言　初期値0
		System.out.println(byteNum);
		short shortNum = 0;//short型の変数　shortNumを宣言　初期値0
		System.out.println(shortNum);
		int intNum = 0;//int型の変数　intNumを宣言　初期値0
		System.out.println(intNum);
		long longNum = 0L;//long型の変数 longNumを宣言　初期値0
		System.out.println(longNum);
		float floatNum = 0.0f;//float型の変数 floatNumを宣言　初期値0.0f
		System.out.println(floatNum);
		double doubleNum = 0.0;//double型の変数　doubleNumを宣言 初期値0.0
		System.out.println(doubleNum);
		char letter = '\u0000';//char型の変数　letterを宣言　初期値"a"
		System.out.println(letter);
		String letters = null;//String型の変数　lettersを宣言　初期値""
		System.out.println(letters);
		boolean isBoolean = false;//boolean型の変数　isBooleanを宣言　初期値false
		System.out.println(isBoolean);

		byteNum = 10; //数byteNumに10を代入
		System.out.println(byteNum);
		shortNum = 100;//変数shortNumに100を代入
		System.out.println(shortNum);
		intNum = 1000;//変数intNumに1000を代入
		System.out.println(intNum);
		longNum = 10000;//変数longNumに10000を代入
		System.out.println(longNum);
		floatNum = 9.5f;//変数floatNumに9.5fを代入
		System.out.println(floatNum);
		doubleNum = 10.5;//変数doubleNumに10.5を代入
		System.out.println(doubleNum);
		letter = 'a';//変数letterに"a"を代入
		System.out.println(letter);
		letters = "ハロー";//変数lettersに"ハロー"を代入
		System.out.println(letters);
		isBoolean = true;//変数isBooleanにtrueを代入
		System.out.println(isBoolean);

		System.out.println(longNum + intNum + shortNum + byteNum);

		System.out.println(byteNum * 2);

		System.out.println(letter + letters + isBoolean);

		System.out.println(longNum + intNum + shortNum + byteNum + byteNum + byteNum);

		System.out.println(byteNum * shortNum * intNum * longNum);

		System.out.println(doubleNum / shortNum);

		System.out.println(shortNum - byteNum);

		String name = "山田太郎";
		System.out.println("こんにちは," + name + "さん!");

		int age = 25;
		System.out.println("年齢; " + age + "歳");

		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);

		int score = 80;
		score = score + 20;
		System.out.println("最終スコア:" + score + "");

		double price = 99.99;
		int intprice = (int) price;

		System.out.println("整数価格" + intprice + "");

		String numStr = "123";

		int num = Integer.parseInt(numStr);

		System.out.println(num + 10);
		
		int num3 =50;
		
		String str = String.valueOf(num3);
		
		System.out.println("得点" + str + "点");
		

		

	}

}
