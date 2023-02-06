import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        String str;
        for(int i = 0; i < n; i++){
            str = br.readLine();
            String[] arr = str.split(" ");
            Stack<String> stk = new Stack<>();
            for(String word : arr){
                stk.push(word);
            }

            sb.append("Case #" + (i + 1) + ": ");
            while(stk.size() > 0){
                sb.append(stk.pop() + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}