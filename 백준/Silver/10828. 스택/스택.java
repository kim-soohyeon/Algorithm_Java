import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String s;
		int[] arr = new int[n];
		int cnt = 0;
		for(int i = 0; i < n; i++) {
//			s = br.readLine();
			String[] str = br.readLine().split(" ");
			if(str[0].equals("push")) {
				arr[cnt++] = (Integer.parseInt(str[1]));
//				StringTokenizer st = new StringTokenizer(s);
//				st.nextToken();
//				arr[cnt++] = Integer.parseInt(st.nextToken());
			}else {
				switch(str[0]) {
					case "pop":
						if(arr[0] == 0) {
							// 비어있는 경우
							sb.append(-1 + "\n");
						}else {
							sb.append(arr[cnt - 1] + "\n");
							arr[cnt-- - 1] = 0;
						}
						break;
					case "size":
						sb.append(cnt + "\n");
						break;
					case "empty":
						if(arr[0] == 0) {
							// 비어있는 경우
							sb.append(1 + "\n");
						}else {
							sb.append(0 + "\n");
						}
						break;
					case "top":
						if(arr[0] == 0) {
							// 비어있는 경우
							sb.append(-1 + "\n");
						}else {
							sb.append(arr[cnt - 1] + "\n");
						}
						break;
				}
			}
		}
		
		System.out.print(sb);
		br.close();
	}

}