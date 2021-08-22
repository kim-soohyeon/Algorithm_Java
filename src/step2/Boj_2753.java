package step2;

import java.util.Scanner;

public class Boj_2753 {

	public static void main(String[] args) {
		//윤년
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		in.close();

	}

}
