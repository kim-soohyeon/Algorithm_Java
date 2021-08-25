package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10871 {

	public static void main(String[] args) throws IOException{
		//X보다 작은 수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());//정수의 개수
		int x = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st2.nextToken());
			if(a < x) {
				sb.append(a).append(" ");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
