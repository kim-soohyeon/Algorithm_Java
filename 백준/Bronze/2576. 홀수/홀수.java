import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[7];
		int[] answer = new int[7];
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < 7; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] % 2 != 0) {
				// 홀수인 경우
				answer[cnt++] = arr[i];
				sum += arr[i];
			}
		}
		
		if(answer[0] == 0) {
			System.out.println(-1);
			return;
		}
		
		int min = answer[0];
		for(int i = 0; i < 7; i++) {
			if(answer[i] == 0) {
				break;
			}
			else {
				if(min > answer[i]) {
					min = answer[i];
				}
			}
		}
		System.out.println(sum);
		System.out.println(min);
		
		br.close();
	}

}