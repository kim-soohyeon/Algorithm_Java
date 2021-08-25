package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_2438 {

	public static void main(String[] args) throws IOException{
		//별 찍기 - 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				bw.append("*");
			}
			bw.append("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
