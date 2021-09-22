package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_4153 {

	public static void main(String[] args) throws IOException{
		//직각삼각형
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[3];
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if(arr[0] == 0 && arr[1] == 0  && arr[2] == 0) {
				break;
			}
			Arrays.sort(arr);
			if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				sb.append("right").append('\n');
			}else {
				sb.append("wrong").append('\n');
			}
		}
		System.out.println(sb);
		br.close();
	}

}
