package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10162 {

	public static void main(String[] args) throws IOException{
		//전자레인지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());//요리시간
		int[] sec = {300, 60, 10};//A, B, C에 지정된 시간(초)
		int[] answer = new int[3];
		
		for(int i = 0; i < 3; i++) {
			if(t >= sec[i]) {
				answer[i] = t / sec[i];
				t %= sec[i];
			}
		}
		
		if(t != 0) {
			//시간을 정확히 맞출 수 없는 경우
			sb.append(-1);
		}else {
			for(int num : answer) {
				sb.append(num).append(" ");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
