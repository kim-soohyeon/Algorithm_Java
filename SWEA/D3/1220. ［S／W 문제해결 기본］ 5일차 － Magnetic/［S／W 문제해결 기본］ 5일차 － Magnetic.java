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
				for(int j = 0; j < 100; j++){
					int num = arr[j][i];
					if(num == 1){
						int k = j;
						while(k++ < 99){
							int num2 = arr[k][i];
							if(num2 == 2){
								answer++;
								j = k;
								break;
							}
						}
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}