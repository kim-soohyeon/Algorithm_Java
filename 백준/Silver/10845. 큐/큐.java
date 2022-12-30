import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
//		push X: 정수 X를 큐에 넣는 연산이다.
//		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 큐에 들어있는 정수의 개수를 출력한다.
//		empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//		front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());//명령 개수
		 StringBuilder sb = new StringBuilder();
		 int[] arr = new int[n];
		 int size = 0;
		 String s;
		 for(int i = 0; i < n; i++) {
			 s = br.readLine();
			 if(s.contains("push")) {
				 StringTokenizer st = new StringTokenizer(s);
				 st.nextToken();
				 arr[size++] = Integer.parseInt(st.nextToken());
			 }else {
				 switch(s) {
				 	case "pop":
				 		if(size == 0) {
				 			// 비어있는 경우
				 			sb.append(-1 + "\n");
				 		}else {
				 			size--;
				 			sb.append(arr[0] + "\n");
				 			int tmp;
				 			for(int j = 1; j <= size; j++) {
				 				tmp = arr[j];
				 				arr[j - 1] = tmp;
				 				arr[j] = 0;
				 			}
				 		}
				 		break;
				 	case "size":
				 		sb.append(size + "\n");
				 		break;
				 	case "empty":
				 		if(size == 0) {
				 			// 비어있는 경우
				 			sb.append(1 + "\n");
				 		}else {
				 			sb.append(0 + "\n");
				 		}
				 		break;
				 	case "front":
				 		if(size == 0) {
				 			// 비어있는 경우
				 			sb.append(-1 + "\n");
				 		}else {
				 			sb.append(arr[0] + "\n");
				 		}
				 		break;
				 	case "back":
				 		if(size == 0) {
				 			// 비어있는 경우
				 			sb.append(-1 + "\n");
				 		}else {
				 			sb.append(arr[size - 1] + "\n");
				 		}
				 		break;
				 }
			 }
		 }
		 System.out.println(sb);
		 br.close();
	}
;}