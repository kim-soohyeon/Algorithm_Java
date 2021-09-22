package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2798 {

	public static void main(String[] args) throws IOException{
		//블랙잭
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());//카드의 개수
		int m = Integer.parseInt(st.nextToken());
		int sum = 0;//카드 3장의 합
		int temp;
		int[] arr = new int[n];//카드에 쓰여 있는 수
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//첫 번째 카드
		for(int i = 0; i < n - 2; i++) {
			//두 번째 카드
			for(int j = i + 1; j < n - 1; j++) {
				//세 번째 카드
				for(int k = j + 1; k < n; k++) {
					temp = arr[i] + arr[j] + arr[k];
					
					if(m == temp) {
						//카드의 합이 m과 같은 경우
						System.out.println(temp);
						return;
					}
					
					if(sum < temp && temp < m) {
						//카드의 합이 이전의 합보다 크고, m보다 작은 경우
						sum = temp;
					}
				}
			}
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
