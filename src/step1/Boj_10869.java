package step1;

import java.util.Scanner;

public class Boj_10869 {

	public static void main(String[] args) {
		//사칙연산
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		in.close();

	}

}
