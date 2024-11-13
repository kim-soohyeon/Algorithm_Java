import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			sb.append("#").append(test_case).append(" ");
            sc.nextLine();
			String findStr = sc.nextLine();
			String str = sc.nextLine();

			int idx = 0;
			int answer = 0;
			while((idx = str.indexOf(findStr, idx)) > 0){
				answer++;
				idx += findStr.length();
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}