package codeup_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1012 {

	public static void main(String[] args) throws IOException{
		//[기초-입출력] 실수 1개 입력받아 그대로 출력하기(설명)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float x = Float.parseFloat(br.readLine());
		
		System.out.printf("%f", x);
		
		br.close();
	}

}
