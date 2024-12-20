import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        // 각 작업의 완료까지 남은 일수를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainingDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.addLast(remainingDays);
        }

        // 큐를 순회하며 배포 처리
        while (!queue.isEmpty()) {
            int firstNum = queue.pollFirst(); // 첫 번째 작업의 남은 일수
            int sum = 1; // 현재 배포에 포함될 작업 수
            
            // 다음 작업들이 첫 번째 작업과 함께 배포 가능한지 확인
            while (!queue.isEmpty() && queue.peekFirst() <= firstNum) {
                queue.pollFirst();
                sum++;
            }
            answer.add(sum);
        }

        return answer;
    }
}
