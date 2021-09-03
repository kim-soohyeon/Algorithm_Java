package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11654 {

	public static void main(String[] args) throws IOException{
		//아스키 코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int value = br.readLine().charAt(0);
		
		System.out.println(value);
		
		br.close();
		
		//System.in은 아스키값을 저장함
//		int a = System.in.read();
//		System.out.println(a);

	}

}
