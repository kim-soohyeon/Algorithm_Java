import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int maxPrize;

    public static void main(String args[]) throws Exception
    {
//        System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        int number, swapCount;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            sb.append("#").append(test_case).append(" ");
            number = sc.nextInt(); // 예시 숫자판
            swapCount = sc.nextInt();  // 교환 횟수

            sb.append(getMaxPrize(number, swapCount)).append("\n");
        }
        System.out.println(sb);
    }

    public static int getMaxPrize(int number, int swapCount) {
        maxPrize = 0; // 최대 금액 초기화
        String numberStr = Integer.toString(number);

        // 백트래킹 함수 호출
        findMaxPrize(numberStr, swapCount, new HashSet<>());

        return maxPrize;
    }

    public static void findMaxPrize(String numberStr, int swapCount, Set<String> visited) {
        if (swapCount == 0) {
            maxPrize = Math.max(maxPrize, Integer.parseInt(numberStr));
            return;
        }

        if (visited.contains(numberStr + swapCount)) {
            return;
        }
        visited.add(numberStr + swapCount);

        int length = numberStr.length();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                String swapped = swapChars(numberStr, i, j);
                findMaxPrize(swapped, swapCount - 1, visited);
            }
        }
    }

    private static String swapChars(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}