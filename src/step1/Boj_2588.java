package step1;

import java.util.Scanner;

public class Boj_2588 {

	public static void main(String[] args) {
		//곱셈
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		
		int b1 = b / 100;
		int b2 = b / 10 % 10;
		int b3 = b % 10;
		
		System.out.println(a*b3);
		System.out.println(a*b2);
		System.out.println(a*b1);
		System.out.println(a*b);
		
		in.close();
	}

}
