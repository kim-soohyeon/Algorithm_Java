package 이코테.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Euclidean {
	//최대공약수 계산(유클리드 호제법) 예제
	public static int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}else {
			return gcd(b, a % b);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		//a와 b의 최대공약수 구하기
		System.out.println(gcd(a, b));
		br.close();
	}

}
