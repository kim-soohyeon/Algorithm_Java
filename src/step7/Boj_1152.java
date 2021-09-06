package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1152 {

	public static void main(String[] args) throws IOException{
		//단어의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		//countTokens(): 토큰의 개수 반환
		System.out.println(st.countTokens());
		br.close();
	}

}
