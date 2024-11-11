import java.util.Arrays;
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
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            int answer = 0;
            for(int i = 2; i < N - 2; i++) {
                int newArr[] = new int[4];
                if (N > 4) {
                    newArr[0] = arr[i - 2];
                    newArr[1] = arr[i - 1];
                    newArr[2] = arr[i + 1];
                    newArr[3] = arr[i + 2];

                    Arrays.sort(newArr);

                    if(arr[i] > newArr[3]){
                        answer += arr[i] - newArr[3];
                    }
                }
            }
            sb.append(answer).append("\n");
		}
        System.out.println(sb);
	}
}