//import java.io.FileInputStream;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
//		System.setIn(new FileInputStream("src/test/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[][] arr = new int[100][100];
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			sc.nextInt();
			sb.append("#").append(test_case).append(" ");
			for(int i = 0; i < 100; i++){
				for(int j = 0; j < 100; j++){
					arr[i][j] = sc.nextInt();
				}
			}

			int answer = 0;
			for(int i = 0; i < 100; i++){
				boolean isN = false;
				for(int j = 0; j < 100; j++){
					int num = arr[j][i];
					if(arr[j][i] == 1) {
						isN = true;
					}else if(arr[j][i] == 2 && isN){
						answer++;
						isN = false;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}