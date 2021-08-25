package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_11021 {

	public static void main(String[] args) throws IOException{
		//A+B - 7
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		int a, b;
		StringTokenizer st;
		
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());	
			bw.append("Case #" + i + ": " + (a+b) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
