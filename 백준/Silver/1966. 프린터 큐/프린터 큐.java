import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());//테스트케이스 개수
		
		StringTokenizer st;
		
		Queue<int[]> imprt = new LinkedList<>();
		
		int n, m, cnt;
		for(int i = 0; i < t; i++) {
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());//문서의 개수
			m = Integer.parseInt(st.nextToken());//궁금한 문서의 위치(0 ~ n - 1)
			
			imprt = new LinkedList<>();//문서의 중요도(1 ~ 9)
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				imprt.add(new int[] {j, Integer.parseInt(st.nextToken())});
			}
			
			if(n == 1) {
				cnt = 1;
			}else {
				while(true) {
					boolean flag = true;
					int fst[] = imprt.remove();
					
					for(int num[] : imprt) {
						if(fst[1] < num[1]) {
							// 중요도가 더 높은 문서가 있는 경우
							flag = false;
							imprt.add(fst);
							break;
						}
					}
					
					if(flag) {
						cnt++;
						if(fst[0] == m) {
							break;
						}
					}
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.print(sb);
		
		br.close();

	}

}