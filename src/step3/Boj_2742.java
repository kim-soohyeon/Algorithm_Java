package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_2742 {

	public static void main(String[] args) throws IOException{
		//기찍 N
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = n; i > 0; i--) {
			bw.append(i + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
