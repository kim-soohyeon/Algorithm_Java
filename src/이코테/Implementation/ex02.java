package 이코테.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 {

	public static void main(String[] args) throws IOException{
		//왕실의 나이트
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 현재 나이트의 위치 입력받기
		String now = br.readLine();
		int row = now.charAt(1) - '0';
		char column = now.charAt(0);
		
		// 나이트가 이동할 수 있는 8가지 방향 정의
		int[][] steps = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
		
		// 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
		int cnt = 0;
		for(int i = 0; i < steps.length; i++) {
			int stepR = -1;
			char stepC = 'A';
			
			// 이동하고자 하는 위치 확인
			stepR = row + steps[i][0];
			stepC = (char) (column + steps[i][1]);
			
			if(stepR < 1 || stepR > 8|| stepC < 'a' || stepC > 'h') continue;

			// 해당 위치로 이동이 가능하다면 카운트 증가
			cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}

}
