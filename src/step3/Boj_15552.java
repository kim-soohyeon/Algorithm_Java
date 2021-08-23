package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_15552 {

	public static void main(String[] args) throws IOException{
		//빠른 A+B
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		
		StringTokenizer st;
		
		for(int i =0; i < t; i++) {
			st = new StringTokenizer(br.readLine()," ");//문자열 분리를 위해
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		br.close();
        
		bw.flush();//버퍼 비우기
		bw.close();//버퍼 닫기
		
		//Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
		//입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임)
		//많은 양의 데이터를 처리할 때 유리하다. 

	}

}
