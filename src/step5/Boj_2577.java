package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2577 {

	public static void main(String[] args) throws IOException{
		//숫자의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//숫자 입력
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		//곱한 값을 String으로 변환
		String str1 = String.valueOf(a*b*c);
		
		//자릿수에 해당하는 인덱스의 배열 값 추가하기
		for(int i = 0; i < str1.length(); i++) {
			arr[str1.charAt(i) - '0']++;
		}
		
		for(int num: arr) {
			System.out.println(num);
		}
		
		br.close();

	}

}
