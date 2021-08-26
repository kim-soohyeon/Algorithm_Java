package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_10952 {

	public static void main(String[] args) throws IOException {
		//A+B - 5
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a, b;
		String ab;
		
		while(true) {
			ab = br.readLine();
			a = ab.charAt(0)-'0';
			b = ab.charAt(2)-'0';
			if(a==0 && b==0) {
				break;
			}
			bw.append((a+b)+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
