import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> arrayList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(arrayList);

        answer = arrayList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}