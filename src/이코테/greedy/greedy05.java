package 이코테.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greedy05 {

	public static void main(String[] args) throws IOException{
		//볼링공 고르기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());//볼링공의 개수
		int m = Integer.parseInt(st.nextToken());//공의 최대 무게
		int[] arr = new int[n];//각 볼링공의 무게
		int[] arr2 = new int[m + 1];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[arr[i]]++;
		}
		
		int cnt = 0;
		for(int su : arr2) {
			if(su > 1) {
				cnt++;
			}
		}
		
		int answer = n * (n - 1) / 2 - cnt;
		
		System.out.println(answer);
		
		br.close();
	}

}
