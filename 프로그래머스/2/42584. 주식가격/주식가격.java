import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            // 스택에 있는 값이 현재 값보다 크면 해당 주식 가격이 떨어진 시점을 계산
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            // 스택에 현재 인덱스 추가
            stack.push(i);
        }

        // 아직 스택에 남아있는 값은 끝까지 가격이 떨어지지 않은 경우
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = n - index - 1;
        }

        return answer;
    }
}