import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		String s = br.readLine();
		int n;
		for(int i = 0; i < s.length(); i++) {
			n = (int)s.charAt(i);
			if(n < 68) {
				sb.append((char)(n + 23));
			}else {
				sb.append((char)(n - 3));
			}
		}
		System.out.print(sb);
		
		br.close();
	}

}