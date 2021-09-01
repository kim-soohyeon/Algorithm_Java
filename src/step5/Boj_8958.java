package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_8958 {

	public static void main(String[] args) throws IOException{
		//OX퀴즈
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		String[] str = new String[t];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			str[i] = br.readLine();
			int cnt = 0;//연속값
			int sum = 0;//누적합계
			for(int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j) == 'O') {
					//문제를 맞았을 때, 연속된 O의 개수
					cnt++;
				}else {
					//문제를 틀렸을 때
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);	
		br.close();
	}

}
