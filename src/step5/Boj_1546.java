package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1546 {

	public static void main(String[] args) throws IOException{
		//평균
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//과목의 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double[] jumsu = new double[n];
		
		for(int i = 0; i < n; i++) {
//			String -> Double형 변환
			jumsu[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(jumsu);//오름차순 정렬
		Double m = jumsu[n-1];//점수 중 최댓값
		Double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += jumsu[i] / m * 100;
		}
		
		System.out.println(sum / n);
		
		br.close();

	}

}
