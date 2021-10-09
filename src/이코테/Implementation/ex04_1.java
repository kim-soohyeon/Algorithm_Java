package 이코테.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04_1 {

	public static void main(String[] args) throws IOException{
		//상하좌우
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//공간의 크기
		String plans = br.readLine();
		
		int x = 1, y = 1;
		// L, R, U, D에 따른 이동 방향 
		int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        
		for(int i = 0; i < plans.length(); i++) {
			char plan = plans.charAt(i);
			// 이동 후 좌표 구하기 
            int nx = -1, ny = -1;
            
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                	nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            
            // 공간을 벗어나는 경우 무시 
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            
            // 이동 수행 
            x = nx;
            y = ny;
		}
		
		System.out.println(x + " " + y);
		
		br.close();
	}

}
