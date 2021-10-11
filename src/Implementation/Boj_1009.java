package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1009 {

	public static void main(String[] args) throws IOException{
		//분산처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int a, b;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			int gob = 1;
			for(int j = 0; j < b; j++) {
				gob = (a * gob) % 10;
			}
			
			if(gob == 0) {
				gob = 10;
			}
			sb.append(gob).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}

}
