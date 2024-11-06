import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int max = sc.nextInt();
			int num;
			sb.append("#").append(test_case).append(" ");
			for(int i = 1; i < 10; i++) {
				num = sc.nextInt();
				if(max < num) max = num;
			}
            sb.append(max);
            sb.append("\n");
		}
		System.out.println(sb);
	}
}