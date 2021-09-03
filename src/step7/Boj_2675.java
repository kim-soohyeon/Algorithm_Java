package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2675 {

	public static void main(String[] args) throws IOException{
		//문자열 반복
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int r = Integer.parseInt(st.nextToken());//반복 횟수
			String s = st.nextToken();//반복할 문자
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					sb.append(s.charAt(j));
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}

}
