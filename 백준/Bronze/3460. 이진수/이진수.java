import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		String str;
		for(int i = 0; i < t; i++) {
			str = Integer.toBinaryString(Integer.parseInt(br.readLine()));
			for(int k = str.length() - 1; k >= 0; k--) {
				if(str.charAt(k) == '1') {
					sb.append(str.length() - 1 - k + " ");
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
		
		br.close();
	}

}