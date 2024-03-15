import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 28; i++){
            arr[sc.nextInt() - 1] = 1;
        }

        int cnt = 0;
        while(cnt < 2){
            for(int i = 0; i < 30; i++){
                if(arr[i] != 1){
                    System.out.println(i + 1);
                    cnt++;
                }
            }
        }
    }
}