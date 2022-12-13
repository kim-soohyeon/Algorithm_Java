import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i = n; i >= 1; i--) {
			for(int j = i; j < n; j++) {
				sb.append(" ");
			}
			for(int j = 1; j <= (2 * i - 1); j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
		br.close();
	}

}