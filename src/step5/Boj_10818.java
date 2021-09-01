package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_10818 {

	public static void main(String[] args) throws IOException{
		//	최소, 최대
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//정수의 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] arr = new int[n];//배열 선언과 크기 할당
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);//오름차순 정렬
		
		System.out.println(arr[0] + " " + arr[n-1]);
		
		br.close();

	}

}
