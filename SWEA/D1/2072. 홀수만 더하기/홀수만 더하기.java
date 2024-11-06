import java.util.Scanner;
import java.util.stream.IntStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            sb.append("#" + test_case + " ");
            int sum = IntStream.range(0, 10)
                                .map(i -> sc.nextInt())
                                .filter(i -> i % 2 != 0)
                                .sum();
            sb.append(sum);
			sb.append("\n");
		}
        System.out.println(sb);
	}
}