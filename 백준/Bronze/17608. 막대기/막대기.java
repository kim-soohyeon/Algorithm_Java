import java.io.*;
import java.util.*;
// https://www.acmicpc.net/problem/17608
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 막대기 개수
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < n; i++){
            stk.push(Integer.parseInt(br.readLine()));
        }

        int max = stk.pop();
        int cnt = 1;
        while (stk.size() > 0){
            int num = stk.pop();
            if(max < num){
                max = num;
                cnt++;
            }
        }
        System.out.print(cnt);

        br.close();
    }

}