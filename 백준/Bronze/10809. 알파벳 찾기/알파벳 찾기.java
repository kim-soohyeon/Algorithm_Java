import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int[] answer = new int[26];
		for(int i = 0; i < answer.length; i++) {
			// 배열 초기화
			answer[i] = -1;
		}
		for(int j = 0; j < s.length(); j++) {
			// 위치 찾기
			if(answer[s.charAt(j) - 'a'] <= -1) {
				answer[s.charAt(j) - 'a'] = j;
			}
		}
		
		for(int val : answer) {
			// 결과 출력
			sb.append(val + " ");
		}
		System.out.print(sb);
		
		br.close();
	}

}
