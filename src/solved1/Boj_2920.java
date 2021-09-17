package solved1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2920 {

	public static void main(String[] args) throws IOException {
		//음계
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String order = "";	//연주 순서
		int[] sound = new int[8];//음계
		
		for(int i = 0; i < 8; i++) {
			sound[i] = Integer.parseInt(st.nextToken());
		}
		
		//연주 순서 판별
		for(int i = 0; i < sound.length - 1; i++) {
			if(sound[i] == sound[i + 1] - 1) {
				//오름차순
				order = "ascending";
			}else if(sound[i] == sound[i + 1] + 1) {
				//내림차순
				order = "descending";
			}else {
				//그 외
				order = "mixed";
				break;
			}
		}
		
		System.out.println(order);
		br.close();

	}

}
