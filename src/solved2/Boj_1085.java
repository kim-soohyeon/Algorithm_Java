package solved2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1085 {

	public static void main(String[] args) throws IOException {
		//직사각형에서 탈출
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int[] dis = {x, y, w - x, h - y};//각 경계선까지의 거리
		
		Arrays.sort(dis);
		System.out.println(dis[0]);
		
		br.close();
	}
}
