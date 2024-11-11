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
                // 현재 건물 기준으로 좌우 2칸만 비교
                int leftMax = Math.max(arr[i - 2], arr[i - 1]);
                int rightMax = Math.max(arr[i + 1], arr[i + 2]);
                
                // 현재 건물이 양쪽을 모두 초과하는 경우에만 조망권 확보
                if (arr[i] > leftMax && arr[i] > rightMax) {
                    answer += arr[i] - Math.max(leftMax, rightMax);  // 초과하는 높이만큼 더함
                }
            }

            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}