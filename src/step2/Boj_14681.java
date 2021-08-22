package step2;

import java.util.Scanner;

public class Boj_14681 {

	public static void main(String[] args) {
		//사분면 고르기
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(x > 0 && y > 0) {
			//1사분면
			System.out.println(1);
		}else if(x < 0 && y > 0) {
			//2사분면
			System.out.println(2);
		}else if(x < 0 && y < 0) {
			//3사분면
			System.out.println(3);
		}else{
			//4사분면
			System.out.println(4);
		}
		
		in.close();

	}

}
