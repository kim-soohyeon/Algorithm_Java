import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			System.out.print("#"+test_case+" ");
            sc.nextLine();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int answer = n;

			if(m == 0) {
				answer = 1;
			}

			while(m-- > 1){
				answer *= n;
			}

			sc.nextLine();
			System.out.println(answer);
		}
	}
}