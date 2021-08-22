package step2;

import java.util.Scanner;

public class Boj_9498 {

	public static void main(String[] args) {
		//시험 성적
		Scanner in = new Scanner(System.in);
		
		int jumsu = in.nextInt();
		
		if(90<=jumsu && jumsu<=100) {
			System.out.println('A');
		}else if(80<=jumsu) {
			System.out.println('B');
		}else if(70<=jumsu) {
			System.out.println('C');
		}else if(60<=jumsu) {
			System.out.println('D');
		}else{
			System.out.println('F');
		}
		
		in.close();
		
//		&&(논리 연산자) -> 단락 회로 평가
//		&(비트 연산자)
	}

}
