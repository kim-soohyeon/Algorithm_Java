package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj_10773 {

	public static void main(String[] args) throws IOException{
		//제로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());//정수의 개수
		ArrayList<Integer> arrLst = new ArrayList<Integer>();
		
		for(int i = 0; i < k; i++) {
			int su = Integer.parseInt(br.readLine());
			
			if(su != 0) {
				//정수가 "0"이 아닌 경우
				arrLst.add(su);
			}else {
				//정수가 "0" 일 경우
				arrLst.remove(arrLst.size() - 1);
			}
		}
		
		// 최종적으로 적어 낸 수의 합 구하기
		int sum = 0;
		for(int num : arrLst) {
			sum += num;
		}
		
		System.out.println(sum);
		br.close();
	}

}
