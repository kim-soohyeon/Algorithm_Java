package step2;

import java.util.Scanner;

public class Boj_1330 {

	public static void main(String[] args) {
		//두 수 비교하기
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		in.close();

	}

}
