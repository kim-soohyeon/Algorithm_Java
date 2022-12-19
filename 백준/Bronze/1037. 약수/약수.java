import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		최소 * 최대
		int min = arr[0];
		int max = arr[0];
		for(int i = 1; i < cnt; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(min * max);
		
		br.close();
	        
	}

}