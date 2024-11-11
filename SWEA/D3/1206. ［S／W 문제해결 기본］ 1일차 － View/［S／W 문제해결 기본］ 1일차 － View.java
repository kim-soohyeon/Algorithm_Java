import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            sb.append("#").append(test_case).append(" ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int answer = 0;
            for (int i = 2; i < N - 2; i++) {
                int leftMax = Math.max(arr[i - 2], arr[i - 1]);
                int rightMax = Math.max(arr[i + 1], arr[i + 2]);
                int max = Math.max(leftMax, rightMax);                
                if (arr[i] > max) {
                    answer += arr[i] - max;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}