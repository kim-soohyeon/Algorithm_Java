import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            char chr = str.charAt(i);

            if(Character.isUpperCase(chr)){
                answer += Character.toLowerCase(chr);
            }else{
                answer += Character.toUpperCase(chr);
            }
        }
        System.out.println(answer);

        sc.close();
    }
}