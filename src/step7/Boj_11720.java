package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11720 {

	public static void main(String[] args) throws IOException{
		//숫자의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//숫자의 개수
		String str = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += (str.charAt(i) - '0');
		}
		
		System.out.println(sum);
		
		br.close();

	}

}
