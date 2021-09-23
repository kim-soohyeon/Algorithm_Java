package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_15829 {
	static final int m = 1234567891;
	
	public static void main(String[] args) throws IOException{
		//Hashing
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());//문자열의 길이
		String str = br.readLine();//문자열
		int ch;//문자
		long hash = 0;//해시 값
		
		for(int i = 0; i < l; i++) {
			ch = str.charAt(i) - 'a' + 1;
			hash += ch * hash(i);
		}
		
		System.out.println(hash % m);
		
		br.close();
	}
	
	public static long hash(int b) {
		return b == 0 ? 1 : 31 * hash(b - 1) % m;
	}

}
