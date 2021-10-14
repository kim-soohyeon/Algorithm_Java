package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_1966 {

	public static void main(String[] args) throws IOException{
		//프린터 큐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 수
		int n = 0, m = 0;
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());//문서의 개수
			m = Integer.parseInt(st.nextToken());//몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; i < n; j++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
		}
		System.out.println(n + " " + m);
		br.close();

	}

}
