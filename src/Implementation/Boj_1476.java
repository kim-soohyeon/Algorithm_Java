package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1476 {

	public static void main(String[] args) throws IOException{
		//날짜 계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int e = Integer.parseInt(st.nextToken());//지구
		int s = Integer.parseInt(st.nextToken());//태양
		int m = Integer.parseInt(st.nextToken());//달
		
		int i = 1, j = 1, k = 1;
		int year = 1;//연도
		
		while(true) {
			if(i == e && j == s && m == k) {
				break;
			}
			
			i++;
			j++;
			k++;
			year++;
			
			if(i > 15) i = 1;
			if(j > 28) j = 1;
			if(k > 19) k = 1;
		}
		
		System.out.println(year);
		br.close();
	}

}
