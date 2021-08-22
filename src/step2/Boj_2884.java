package step2;

import java.util.Scanner;

public class Boj_2884 {

	public static void main(String[] args) {
		//알람 시계
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();	//시
		int m = in.nextInt();	//분

		if(m >= 45) {
			System.out.println(h + " " + (m - 45));
		}else {
			if(h == 0) {
				System.out.print(23);
			}else {
				System.out.print(h - 1);
			}
			System.out.print(" " + (m + 15));
		}
		
		in.close();

	}

}
