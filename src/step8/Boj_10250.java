package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10250 {

	public static void main(String[] args) throws IOException{
		//ACM 호텔
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스 개수
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int h, n;//호텔의 층 수, 몇 번째 손님인지
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			h = Integer.parseInt(st.nextToken());
			st.nextToken();//w는 입력받지만 사용하지 않음.
			n = Integer.parseInt(st.nextToken());
			if(n % h == 0) {
				//꼭대기층인 경우
				sb.append((h * 100) + (n / h)).append("\n");
			}else {
				sb.append(((n % h) * 100) + (n / h + 1)).append("\n");
			}
		}
		System.out.println(sb);
		br.close();
	}

}
