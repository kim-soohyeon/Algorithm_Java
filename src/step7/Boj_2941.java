package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {

	public static void main(String[] args) throws IOException{
		//	크로아티아 알파벳
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = {"c=", "c-", "dz=", "d-" , "lj", "nj", "s=", "z="};
		
		for(String word : arr) {
			if(str.contains(word)) {
				str = str.replace(word, "*");
			}
		}
		
		System.out.println(str.length());
		br.close();
	}

}
