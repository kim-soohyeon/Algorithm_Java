package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2908 {

	public static void main(String[] args) throws IOException {
		//상수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//상근이가 적은 수 a, b
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int sangsuA = sangsu(a);
		int sangsuB = sangsu(b);
		
		if(sangsuA > sangsuB) {
			System.out.println(sangsuA);
		}else {
			System.out.println(sangsuB);
		}
		
		br.close();

	}
	
	public static int sangsu(int su) {
		int num1 = su % 10;			//일의자리수
		int num2 = (su / 10) % 10;	//십의자리수
		int num3 = su / 100;		//백의자리수
		return num1 * 100 + num2 * 10 + num3;
	}

}
