package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10809 {

	public static void main(String[] args) throws IOException {
		//	알파벳 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		
		//배열 -1로 초기화
		for(int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i < s.length(); i++) {
			int alphabetIndex = s.charAt(i) - 'a';
			if(arr[alphabetIndex] == -1) {
				arr[alphabetIndex] = i;
			}
		}
		
		for(int value : arr) {
			System.out.print(value + " ");
		}

		br.close();
	}

}
