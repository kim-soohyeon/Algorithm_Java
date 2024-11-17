import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        for (int test_case = 1; test_case <= 10; test_case++) {
            sc.nextInt();
            sb.append("#").append(test_case).append(" ");
            
            Queue<Integer> que = new LinkedList<>();
            for (int i = 0; i < 8; i++) {
                que.add(sc.nextInt());
            }
            
            boolean stop = false;
            while (!stop) {
                for (int i = 1; i <= 5; i++) {
                    int num = que.poll() - i;
                    if (num <= 0) {
                        que.add(0);
                        stop = true;
                        break;
                    } else {
                        que.add(num);
                    }
                }
            }
            
            for (int q : que) {
                sb.append(q).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}