import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++){
            int chr = a.charAt(i);            
            if(chr < 'a'){
                // 대문자일 경우
                System.out.print((char)(chr + 32));
            }else{
                // 소문자일 경우
                System.out.print((char)(chr - 32));
            }
        }
    }
}