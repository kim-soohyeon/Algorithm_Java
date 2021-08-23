package step3;

import java.util.Scanner;

public class Boj_8393 {

	public static void main(String[] args) {
		//합
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 0;//합
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		in.close();
	}

}
