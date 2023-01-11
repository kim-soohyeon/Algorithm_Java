import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		String str;
		for(int i = 0; i < t; i++) {
			str = br.readLine();
			int open = 0;
			int close = 0;
			Boolean status = true;
			for(char chr : str.toCharArray()) {
				if(chr == '(') {
					open++;
				}else {
					close++;
				}
				
				if(open < close) {
					// 닫힌 괄호가 열린 괄호보다 먼저 나올 경우 예외 처리
					status = false;
					break;
				}
			}
			if(status) {
				if(open == close) {
//					System.out.println("YES");
					sb.append("YES");
				}else {
//					System.out.println("NO");
					sb.append("NO");
				}
			}else {
//				System.out.println("NO");
				sb.append("NO");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
		br.close();
	}

}