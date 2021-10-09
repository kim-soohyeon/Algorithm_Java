package 이코테.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04_2 {

	public static void main(String[] args) throws IOException{
		//시각(완전 탐색)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int h = Integer.parseInt(br.readLine());//시
		int cnt = 0;
		
		for(int i = 0; i <= h; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0; k < 60; k++) {
					if(check(i, j, k)) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
	
	public static boolean check(int h, int m, int s) {
		if(h % 10 == 3 || m % 10 == 3 || s % 10 == 3 || m / 10 == 3 || s / 10 == 3) {
			//3, 13, 23 ,30, 33, 43, 53
			return true;
		}
		
		return false;
	}

}
