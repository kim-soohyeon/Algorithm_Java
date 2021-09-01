package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Boj_3052 {

	public static void main(String[] args) throws IOException{
		//	나머지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// HashSet: 중복을 허용하지 않음.
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(hs.size());
		
		br.close();
	}

}
