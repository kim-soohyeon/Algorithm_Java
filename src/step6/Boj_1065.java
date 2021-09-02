package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1065 {

	public static void main(String[] args) throws IOException{
		//	한수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(hansu(n));
		
		br.close();

	}
	
	public static int hansu(int n) {
		
		int cnt = 0;//한수의 개수
		
		if(n < 100) {
			//1~99는 그 자체가 수열이다.
			return n;
		}else {
			cnt = 99;
			if(n == 1000) {
				n = 999;//1000은 등차수열이 아니기때문에 -1 해준다.
			}
			for(int i = 100; i <= n; i++) {
				int n1 = i % 10;		//일의 자리수
				int n2 = (i /10) % 10;	//십의 자리수
				int n3 = i /100;		//백의 자리수
				
				if((n1 - n2) == (n2 - n3)) {
					//각 자리수가 등차수열인 경우
					cnt++;
				}
			}
		}
		
		return cnt;
	}

}
