package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Boj_1931 {

	public static void main(String[] args) throws IOException{
		//회의실 배정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());//회의의 수
		int[][] time = new int[n][2];//시작시간, 종료시간
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			time[i][0] = Integer.parseInt(st.nextToken());//시작시간
			time[i][1] = Integer.parseInt(st.nextToken());//종료시간
		}
		System.out.println(time);
		// 종료시간 기준으로 정렬하기 위해 compare 재정의 
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] start, int[] end) {
				
				// 종료시간이 같을 경우 시작시간 오름차순 정렬 
				if(start[1] == end[1]) {
					return start[0] - end[0];
				}
				
				return start[1] - end[1];
			}
 
		});		
		System.out.println(time);
		
		int cnt = 0;//회의의 최대 개수
		int endTime = 0;
		
		for(int i = 0; i < n; i++) {
			if(time[i][0] >= endTime) {
				//직전 종료시간이 다음 시작시간보다 작거나 같다면
				endTime = time[i][1];
				cnt++;
			}	
		}	
		
		System.out.println(cnt);
		
		br.close();
	}

}
