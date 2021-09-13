package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2869 {

	public static void main(String[] args) throws IOException{
		//달팽이는 올라가고 싶다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());//올라가는 미터
		int b = Integer.parseInt(st.nextToken());//미끄러지는 미터
		int v = Integer.parseInt(st.nextToken());//나무 막대 높이
		int day = (v - b) / (a - b);//걸린 일수
		
		if((v - b) % (a - b) > 0) {
			day++;
		}
		
		System.out.println(day);
		br.close();
	}

}
