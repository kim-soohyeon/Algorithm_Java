package 이코테.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class greedy01 {

	public static void main(String[] args) throws IOException{
		//모험가 길드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//모험가의 수
		ArrayList<Integer> arrList = new ArrayList<>();//모험가의 공포도
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < n; i++) {
			arrList.add(Integer.parseInt(st.nextToken()));
		}
		
		//오름차순 정렬
		Collections.sort(arrList);
		
		int result = 0;//총 그룹 수
		int cnt = 0;//현재 그룹의 모험가 수
		
		for(int i = 0; i < n; i++) {
			cnt++;//현재 그룹에 모험가 포함시키기
			if(cnt >= arrList.get(i)) {//현재 그룹에 포함된 모험가의 수가 현재 공포도 이상이라면, 그룹 결성
				result++;//총 그룹 수 증가
				cnt = 0;//현재 그룹 모험가 수 초기화
			}
		}
		System.out.println(result);
		br.close();
	}

}
