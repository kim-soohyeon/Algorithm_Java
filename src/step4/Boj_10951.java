package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10951 {

	public static void main(String[] args) throws IOException{
		//A+B - 4
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String ab;
		int a, b;
		
		while((ab = br.readLine()) != null) {
			a = ab.charAt(0) - '0';
			b = ab.charAt(2) - '0';
			sb.append(a + b).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();

	}

}
