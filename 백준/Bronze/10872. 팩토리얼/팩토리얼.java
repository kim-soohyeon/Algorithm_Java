import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = n;
		if(n < 2) {
			answer = 1;
		}else {
			for(int i = n - 1; i > 0; i--) {
				answer *= i;
			}
		}
		System.out.print(answer);
		
		br.close();
	}

}