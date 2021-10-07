package 이코테.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy03 {

	public static void main(String[] args) throws IOException{
		//문자열 뒤집기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int cnt0 = 0;// 전부 0으로 바꾸는 경우
		int cnt1 = 0;// 전부 1로 바꾸는 경우
		int prev = s.charAt(0) - '0';
		
		// 첫 번째 원소에 대해서 처리
		if(prev == 0) {
			cnt0 = 1;
		}else {
			cnt1 = 1;
		}
		
		// 두 번째 원소부터 모든 원소를 확인하며
		for(int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i) - '0';
			if(ch != prev) {
				if(ch == 0) {
					// 다음 수에서 0으로 바뀌는 경우
					cnt0++;
				}else {
					// 다음 수에서 1로 바뀌는 경우
					cnt1++;
				}
				prev = ch;
			}
		}
		
		System.out.println(Math.min(cnt0, cnt1));
		br.close();
	}
}
