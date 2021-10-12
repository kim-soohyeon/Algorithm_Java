package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_7568 {

	public static void main(String[] args) throws IOException{
		//덩치
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//전체 사람의 수
		int[][] arr = new int[n][2];
		StringTokenizer st;
		int[] answer = new int[n];//정답
		
		//키와 몸무게 입력받기
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			answer[i] = 1;
		}
		
		//등수 계산하기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					//같은 사람은 비교X
					continue;
				}
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					//i가 j보다 덩치가 작을 경우 등수 증가
					answer[i]++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int ans : answer) {
			sb.append(ans).append(" ");
		}
		
		System.out.println(sb);
		br.close();

	}

}
