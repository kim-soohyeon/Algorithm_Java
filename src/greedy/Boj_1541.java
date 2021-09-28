package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1541 {

	public static void main(String[] args) throws IOException{
		//잃어버린 괄호
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer Subtraction = new StringTokenizer(br.readLine(), "-");//'-' 기준으로 분리
		StringTokenizer Addition;//'+' 기준으로 분리
		int sum = Integer.MAX_VALUE;//첫 번째 토큰 확인을 위한 값
		int add;
		
		// hasMoreTokens: 다음에 읽어 들일 token이 있으면 true, 없으면 false
		while(Subtraction.hasMoreTokens()) {
			add = 0;
			
			//'-'로 나눈 토큰을 '+'로 나눈다.
			Addition = new StringTokenizer(Subtraction.nextToken(), "+");
			
			// '+'로 나눈 토큰을 모두 더한다.
			while(Addition.hasMoreTokens()) {
				add += Integer.parseInt(Addition.nextToken());
			}
			
			if(sum == Integer.MAX_VALUE) {
				//첫 번째 토큰인 경우(양수)
				sum = add;
			}else {
				sum -= add;
			}	
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
