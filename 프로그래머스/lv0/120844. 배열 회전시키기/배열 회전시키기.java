import java.util.*;
class Solution {
    public Deque<Integer> solution(int[] numbers, String direction) {
        Deque<Integer> deq = new LinkedList<>();
        for(int i = 0; i < numbers.length; i++){
            deq.add(numbers[i]);
        }
        if(direction.equals("left")){
            //fifo
            deq.add(deq.removeFirst());
        }else{
            // lifo
            deq.addFirst(deq.removeLast());
        }
        return deq;
    }
}