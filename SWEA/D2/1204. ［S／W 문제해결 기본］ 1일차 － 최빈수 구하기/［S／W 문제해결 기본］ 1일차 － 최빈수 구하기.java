import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int test_case = 1; test_case <= T; test_case++) {
            sc.nextInt(); // 테스트 케이스 번호는 읽고 넘어감
            sb.append("#").append(test_case).append(" ");
            HashMap<Integer, Integer> map = new HashMap<>();

            // 1000개의 점수 입력 받기
            for (int i = 0; i < 1000; i++) {
                int num = sc.nextInt(); // 각 점수를 입력받아 빈도수 카운트
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // value 기준 내림차순, 같은 빈도수일 경우 점수 기준 내림차순
            int answer = map.entrySet().stream()
                    .sorted((o1, o2) -> {
                        int compare = Integer.compare(o2.getValue(), o1.getValue());
                        if (compare == 0) { // 빈도수가 같으면 점수 기준 내림차순
                            return Integer.compare(o2.getKey(), o1.getKey());
                        }
                        return compare;
                    })
                    .mapToInt(HashMap.Entry::getKey)
                    .findFirst()
                    .orElse(0); // 결과가 없을 경우 기본값 0

            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}