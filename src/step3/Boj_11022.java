package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_11022 {

	public static void main(String[] args) throws IOException{
		//	A+B - 8
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		
		for(int i =1; i <= t; i++) {
			String ab = br.readLine();
			int a = ab.charAt(0) - '0';
			int b = ab.charAt(2) - '0';
			
			bw.append("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
