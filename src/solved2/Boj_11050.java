package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11050 {

	public static void main(String[] args) throws IOException{
		//이항 계수 1(nCr)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int answer = 1;
		
		for(int i = n; i > n - k; i--) {
			answer *= i;
		}
		for(int i = k; i > 1; i--) {
			answer /= i;
		}
		
		System.out.println(answer);
		
		br.close();
	}

}
