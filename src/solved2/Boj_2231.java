package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2231 {

	public static void main(String[] args) throws IOException{
		//분해합(부르트포스)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strN = br.readLine();
		int n = Integer.parseInt(strN);
		int sum = 0;//각 자릿수의 합
		int su;
		
		for(int i = n - 9 * strN.length(); i < n; i++) {
			su = i;
			sum = su;
			while(su != 0) {
				//각 자릿수의 합 구하기
				sum += su % 10;
				su /= 10;
			}
			if(sum == n) {
				//생성자인 경우
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
		
		br.close();

	}

}
