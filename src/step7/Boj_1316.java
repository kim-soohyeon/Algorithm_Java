package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1316 {

	public static void main(String[] args) throws IOException{
		// 그룹 단어 체커
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//단어의 개수
		String word;
		int cnt = 0;//그룹 단어 개수

		for(int i = 0; i < n; i++) {
			word = br.readLine();
			if(groupChk(word)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
	
	public static boolean groupChk(String word) {
		int prev = 0;
		boolean[] abcArr = new boolean[26];
		
		for(int j = 0; j < word.length(); j++) {
			int now = word.charAt(j);
			
			if(prev != now) {//앞문자와 현재 문자가 다른 경우
				if(!abcArr[now - 'a']) {//현재 문자가 처음 나온 경우
					abcArr[now - 'a'] = true;
					prev = now;
				}else {//현재 문자가 처음이 아닌 경우
					return false;//함수 종료
				}
			}
		}
		return true;
	}
}
