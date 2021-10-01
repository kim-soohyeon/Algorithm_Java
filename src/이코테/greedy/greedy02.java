package 이코테.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy02 {

	public static void main(String[] args) throws IOException{
		//곱하기 혹은 더하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();//숫자로 구성된 하나의 문자열
		
		//첫 번째 문자를 숫자로 변경한 값 대입
		long answer = s.charAt(0) - '0';
		
		for(int i = 1; i < s.length(); i++) {
			int chr = s.charAt(i) - '0';
			
			//두 수 중에서 하나라도 0 또는 1인 경우, 더하기 수행
			if(answer <= 1 || chr <= 1) {
				answer += chr;
			}else {
				answer *= chr;
			}
		}
		System.out.println(answer);
		br.close();		
	}

}
