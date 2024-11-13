import java.util.Scanner;

class Solution
{
	private static char[][] matrix = new char[8][8];
	private static int len;

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		matrix = new char[8][8];

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			sb.append("#").append(test_case).append(" ");
			len = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < 8; i++){
				String str = sc.nextLine();
				matrix[i] = str.toCharArray();
			}

			int answer = 0;
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j <= 8 - len; j++){
					//가로
					if(solution(i, j, true)) answer++;
					//세로
					if(solution(j, i, false)) answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}

	private static boolean solution(int row, int col, boolean flag){
		if(flag){
			//가로
			for(int i = 0; i < len /2; i++){
				if(matrix[row][col + i] != matrix[row][col + len - i - 1]) return false;
			}
		}else{
			//세로
			for(int i = 0; i < len /2; i++){
				if(matrix[row + i][col] != matrix[row + len - i - 1][col]) return false;
			}
		}
		return true;
	}
}