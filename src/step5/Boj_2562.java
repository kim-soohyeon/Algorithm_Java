package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2562 {

	public static void main(String[] args) throws IOException{
		//최댓값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int[] maxArr = new int[2];//최댓값의 값, 배열위치
		int cnt = 0;
		
		maxArr[0]=0;
		
		//9개의 값 입력
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//값 비교하여 최댓값 찾기
		for(int value : arr) {
			cnt++;
			if(value > maxArr[0]) {
				maxArr[0]=value;
				maxArr[1]=cnt;
			}
		}
		
		System.out.println(maxArr[0]);
		System.out.println(maxArr[1]);
		
		br.close();

	}

}
