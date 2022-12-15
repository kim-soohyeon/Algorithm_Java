import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0]; //ÃÖ´ñ°ª
		int maxIdx = 0;	  //ÃÖ´ñ°ª ÀÎµ¦½º
		for(int i = 0; i < 9; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(max < arr[j]) {
					max = arr[j];
					maxIdx = j;
					break;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxIdx + 1);
		
		br.close();
		
	}

}