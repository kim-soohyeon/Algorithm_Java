import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] deq = new int[n];
		int size = 0;
		int temp;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch(s){
				case "push_front":
//					push_front X: 정수 X를 덱의 앞에 넣는다.
					if(size == 0) {
						deq[size] = Integer.parseInt(st.nextToken());
					}else {
						for(int j = n - 1; j >= 0; j--) {
							if(deq[j] != 0) {
								temp = deq[j];
								deq[j + 1] = temp;
							}
						}
						deq[0] = Integer.parseInt(st.nextToken());
					}
					size++;
					break;
				case "push_back":
//					push_back X: 정수 X를 덱의 뒤에 넣는다.
					deq[size++] = Integer.parseInt(st.nextToken());
					break;
				case "pop_front":
//					pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(size > 0) {
						sb.append(deq[0] + "\n");
						for(int j = 1; j < n; j++) {
							if(deq[j] != 0) {
								temp = deq[j];
								deq[j - 1] = temp;
							}else {
								break;
							}
						}
						size--;
					}else {
						sb.append(-1 + "\n");
					}
					break;
				case "pop_back":
//					pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(size > 0) {
						sb.append(deq[size - 1] + "\n");
						deq[size - 1] = 0;
						size--;
					}else {
						sb.append(-1 + "\n");
					}
					
					break;
				case "size":
//					size: 덱에 들어있는 정수의 개수를 출력한다.
					sb.append(size + "\n");
					break;
				case "empty":
//					empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
					sb.append(size > 0 ? 0 : 1);
					sb.append("\n");
					break;
				case "front":
//					front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					sb.append(size > 0 ? deq[0] : -1);
					sb.append("\n");
					break;
				case "back":
//					back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					sb.append(size > 0 ? deq[size - 1] : -1);
					sb.append("\n");
					break;
			}
		}
		System.out.print(sb);
		
		br.close();
	}

}