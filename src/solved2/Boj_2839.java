package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2839 {

	public static void main(String[] args) throws IOException{
		//설탕 배달
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());//설탕의 무게
		int min1 = 0;//봉지의 최소개수
		
		while(true) {
			if(n % 5 == 0) {
				// 5로 나눠지는 경우
				min1 += n / 5;
				System.out.println(min1);
				break;
			}else{
				// 5로 나눠지지 않으면 -3
				n -= 3;
				min1++;
			}
			
			if(n < 0){
				//n이 음수가 되면 -1
				System.out.println(-1);
				break;
			}
		}
		
		br.close();
	}

}
