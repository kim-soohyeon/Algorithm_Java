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
			String str1 = sc.nextLine();
			String str2 = str1.replace(findStr, "");
			int answer = (str1.length() - str2.length()) / findStr.length();
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}