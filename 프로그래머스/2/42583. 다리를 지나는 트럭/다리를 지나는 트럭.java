import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0, totalWeight = 0;

        for (int truck : truck_weights) {
            while (true) {
                // ❶ 다리 위 상태 업데이트
                if (bridge.size() == bridge_length) {
                    totalWeight -= bridge.poll();
                }

                // ❷ 트럭 추가 조건 확인
                if (totalWeight + truck <= weight) {
                    bridge.add(truck);
                    totalWeight += truck;
                    time++;
                    break;
                } else {
                    // 무게 초과 시 다리 길이를 유지하며 대기
                    bridge.add(0);
                    time++;
                }
            }
        }

        // 모든 트럭이 다리를 건넌 후의 추가 시간
        return time + bridge_length;
    }
}
