package codeup_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup_1013 {

	public static void main(String[] args) throws IOException{
		//[기초-입출력] 정수 2개 입력받아 그대로 출력하기(설명)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a + " " + b);
		
		br.close();
	}

}
