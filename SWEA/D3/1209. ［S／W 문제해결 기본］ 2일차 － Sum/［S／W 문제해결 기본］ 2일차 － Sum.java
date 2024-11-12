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
            sc.nextLine();
            sb.append("#").append(test_case).append(" ");
            int[] iSum = new int[100];
            int[] jSum = new int[100];
            int xSum = 0;
            int ySum = 0;
            for(int i = 0; i < 100; i++){
                for(int j = 0; j < 100; j++){
                    int num = sc.nextInt();
                    iSum[i] += num;
                    jSum[j] += num;
                    if(i == j) xSum += num;
                    if(i + j == 99) ySum += num;
                }
            }
            Arrays.sort(iSum);
            Arrays.sort(jSum);

            int max1 = Math.max(iSum[99], jSum[99]);
            int max2 = Math.max(xSum, ySum);
            int answer = Math.max(max1, max2);
            sb.append(answer).append("\n");
            sc.nextLine();
        }
        System.out.println(sb);
    }
}