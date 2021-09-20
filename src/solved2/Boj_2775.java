package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2775 {

	public static void main(String[] args) throws IOException {
		//부녀회장이 될테야
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		int k = 0, n = 0;//층, 호
		int[][] apt = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			apt[i][1] = 1;//i층 1호
			apt[0][i] = i;//0층 i호
		}
		
		for(int i = 0; i < t; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			for(int layer = 1; layer <= k; layer++) {//1층 ~ k층
				for(int ho = 2; ho <= n; ho++) {//2호 ~ n호
					apt[layer][ho] = apt[layer][ho - 1] + apt[layer - 1][ho];
				}
			}
			sb.append(apt[k][n]).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
