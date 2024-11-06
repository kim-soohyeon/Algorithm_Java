import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		int sum = 0;
		for(int test_case = 1; test_case <= T; test_case++) {
            sum = 0;
			sb.append("#" + test_case + " ");
			for(int i = 0; i < 10; i++){
				sum += sc.nextInt();
			}
			sb.append(Math.round(sum / 10.0));
			sb.append("\n");
		}

		System.out.println(sb);
	}
}