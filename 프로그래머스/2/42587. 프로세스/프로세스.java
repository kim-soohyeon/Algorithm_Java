import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> priorityQueue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.add(priorities[i]);
            indexQueue.add(i);
        }

        int answer = 0;

        while (!priorityQueue.isEmpty()) {
            int current = priorityQueue.poll();
            int currentIndex = indexQueue.poll();

            if (priorityQueue.stream().anyMatch(p -> p > current)) {
                priorityQueue.add(current);
                indexQueue.add(currentIndex);
            } else {
                answer++;
                if (currentIndex == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}