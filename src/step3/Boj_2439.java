package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj_2439 {

	public static void main(String[] args) throws IOException{
		//별 찍기 - 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--) {
				sb.append(" ");
			}
			for(int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
		
		br.close();
	}

}
