import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int dump, min, max, answer;
		int[] arr =new int[100];
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			sb.append("#").append(test_case).append(" ");
			dump = sc.nextInt();
			for(int i = 0; i < 100; i++){
				arr[i] = sc.nextInt();
			}

			for(; dump > 0; dump--){
				Arrays.sort(arr);

				min = arr[0]++;
				max = arr[99]--;

				answer = max - min;
				if(answer <= 1){
					break;
				}
			}
			Arrays.sort(arr);
			answer = arr[99] - arr[0];
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}