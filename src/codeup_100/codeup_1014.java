package codeup_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup_1014 {

	public static void main(String[] args) throws IOException{
		//[기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		char x = st.nextToken().charAt(0);
		char y = st.nextToken().charAt(0);
		
		System.out.println(y + " " + x);
		
		br.close();
	}

}
