import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수
		int cnt; // 토큰 개수
		ArrayList<String> arr;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			arr = new ArrayList<>();
			
			cnt = st.countTokens();
			int arrLen;
			for(int j = 0; j < cnt; j++) {
				arr.add(st.nextToken());
				arrLen = arr.get(j).length();
				if(arrLen > 1) {
					for(int k = arrLen - 1; k >= 0; k--) {
						sb.append(arr.get(j).charAt(k));
					}
				}else {
					sb.append(arr.get(j));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);

		br.close();
	}

}