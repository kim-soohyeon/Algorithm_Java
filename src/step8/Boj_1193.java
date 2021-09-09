package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1193 {

	public static void main(String[] args) throws IOException{
		//	분수찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int crossCnt = 1;//대각선 개수
		int prevSum = 0;//현재 대각선 직전 칸 개수
		
		while(true) {
			//x값 <= 현재 대각선 직전 칸 개수 + 대각선 개수
			if(x <= prevSum + crossCnt) {
				if(crossCnt % 2 == 1) {//대각선의 개수가 홀수일 때
					System.out.println((crossCnt - (x - prevSum - 1)) + "/" + (x - prevSum));
					break;
				}else {//대각선의 개수가 짝수일 때
					System.out.println((x - prevSum) + "/" + (crossCnt - (x - prevSum - 1)));
					break;
				}
			}else {
				prevSum += crossCnt;
				crossCnt++;
			}
		}
		br.close();
	}

}
