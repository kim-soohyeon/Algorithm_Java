import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		int num1, num2;
		for(int test_case = 1; test_case <= T; test_case++){
			num1 = sc.nextInt();
            num2 = sc.nextInt();
            sb.append("#" + test_case + " ");
            if(num1 > num2){
                sb.append(">");
            } else if(num1 < num2){
                sb.append("<");
            } else{
                sb.append("=");
            }
            sb.append("\n");
		}
        System.out.println(sb);
	}
}