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
            sb.append("#").append(test_case).append(" ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            int max = arr[N - 1];
            long answer = 0;
            for(int i = N - 2; i >= 0; i--){
                int num = arr[i];
                if(max > num){
                    answer += max - num;
                }else if (max < num){
                    max = num;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}