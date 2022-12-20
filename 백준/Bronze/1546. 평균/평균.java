import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		float[] arr = new float[n];
		float max = 0; 
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		float answer = 0;
		for(int j = 0; j < n; j++) {
			answer += (arr[j] / max * 100);
		}
		System.out.println(answer / n);
		
		br.close();
	}
}