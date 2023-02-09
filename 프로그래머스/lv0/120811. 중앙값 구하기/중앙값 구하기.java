import java.util.*;

class Solution {
    public int solution(int[] array) {
        int idx = (array.length / 2) + (array.length % 2) - 1;
        Arrays.sort(array);
        int answer = array[idx];
        return answer;
    }
}