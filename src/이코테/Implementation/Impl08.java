package 이코테.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Impl08 {

	public static void main(String[] args) throws IOException{
		// 문자열 재정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int sum = 0;
		ArrayList<Character> answer = new ArrayList<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				answer.add(ch);
			}else {
				sum += ch - '0';
			}
		}
		// 알파벳을 오름차순으로 정렬
        Collections.sort(answer);
        
        // 알파벳을 차례대로 출력
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
        }
        
        // 숫자가 하나라도 존재하는 경우 가장 뒤에 출력
        if (sum != 0) sb.append(sum);
		
		System.out.println(sb);
	}

}
