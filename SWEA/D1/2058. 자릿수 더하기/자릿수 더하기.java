import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextInt() + "";
        int sum = 0;
        for(int i = 0; i < T.length(); i++){
            int chr = T.charAt(i) - '0';
            sum += chr;
        }
        System.out.println(sum);
    }
}