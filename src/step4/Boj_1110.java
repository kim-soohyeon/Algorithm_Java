package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1110 {

	public static void main(String[] args) throws IOException{
		//더하기 사이클
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;//사이클 횟수
		int nCopy = n;
		
		int n1, n10;//일의 자리수, 십의 자리수
		
		do {
			n1 = n % 10;
			n10 = n / 10;
			n = n1 * 10 + ((n1 + n10) % 10);	
			cnt++;
		}while(nCopy != n);
		
		System.out.println(cnt);
		
		br.close();

	}

}
