package sample;
import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
	    System.out.println("Hello, World");

	    Scanner sc = new Scanner(System.in);

        System.out.print("数値を入力してください：");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0 です");
        } else {
            System.out.println("負の数です");
        }
	    
	}

}
