package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1157 {

	public static void main(String[] args) throws IOException{
		//단어 공부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0; i < str.length(); i++) {
			int strCode = str.charAt(i);
			if(strCode > 'Z') {
				//소문자의 경우, 대문자로 바꾼다.
				strCode -= 32;
			}
			//A~Z까지 배열 인덱스 0~25에 1씩 증가한다.
			arr[strCode - 'A'] += 1;
		}
		
		int max = -1;	//가장 많이 사용된 알파벳 인덱스
		char ch = ' ';	//가장 많이 사용된 알파벳
		
		//최댓값 찾기
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch = (char) (i + 65);
			}else if(max == arr[i]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);

		br.close();

	}

}
