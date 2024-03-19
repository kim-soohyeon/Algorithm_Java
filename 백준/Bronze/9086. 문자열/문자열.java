import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String str = sc.next();
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length() - 1));
        }


        sc.close();
    }
}