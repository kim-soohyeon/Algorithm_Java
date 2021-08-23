package step3;

import java.util.Scanner;

public class Boj_2739 {

	public static void main(String[] args) {
		//구구단
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 1; i < 10 ; i++) {
			System.out.println(n + " * " + i +" = " + n*i);
		}
		
		in.close();
	}
}
