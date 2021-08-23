package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_2741 {

	public static void main(String[] args) throws IOException {
		//	N 찍기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			bw.append(i + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
