import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
					status = false;
					break;
				}
			}
			if(status) {
				if(open == close) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
			}

		}
		
		br.close();
	}

}