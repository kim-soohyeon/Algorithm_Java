package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5585 {

	public static void main(String[] args) throws IOException{
		//거스름돈
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int money = 1000 - Integer.parseInt(br.readLine());//지불할 돈
		int answer = 0;//잔돈의 매수
		int[] arr = {500, 100, 50, 10, 5, 1};
		
		while(money > 0) {
			for(int en : arr) {
				if(money >= en) {
					answer += money / en;
					money %= en;
				}
			}
		}
		
		System.out.println(answer);
		br.close();
	}

}
