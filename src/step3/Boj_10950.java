package step3;

import java.util.Scanner;

public class Boj_10950 {

	public static void main(String[] args) {
		//	A+B - 3
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();//테스트 케이스의 개수
		
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
		
		in.close();	

	}

}
