package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2292 {

	public static void main(String[] args) throws IOException{
		//	벌집
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//방 번호
		int cnt = 1;	//최소 개수의 방
		int range = 2;	//범위
		
		if(n == 1) {
			System.out.println(1);
		}else {
			while(range <= n) {
				range += (6 * cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
		
		br.close();
	}

}
