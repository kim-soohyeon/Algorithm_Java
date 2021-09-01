package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_4344 {

	public static void main(String[] args) throws IOException{
		//평균은 넘겠지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		
		StringTokenizer st;
		
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());//학생의 수
			Double[] arr = new Double[n];
			Double sum = 0.0;//점수의 합계
			Double avg;//점수의 평균
			
			for(int j = 0; j < n; j++) {
				arr[j] = Double.parseDouble(st.nextToken());//n명의 점수
				sum += arr[j];
			}	

			avg = sum / n;
			Double cnt = 0.0;//평균이 넘는 학생 수
			
			for(Double value : arr) {
				if(value > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", cnt/n*100);
		}
		
		br.close();

	}

}
