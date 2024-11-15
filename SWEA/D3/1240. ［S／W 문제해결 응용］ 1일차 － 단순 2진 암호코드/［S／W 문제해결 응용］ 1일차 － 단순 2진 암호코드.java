import java.util.HashMap;
import java.util.Scanner;
//import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
//		System.setIn(new FileInputStream("src/test/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb.append("#").append(test_case).append(" ");
			int N = sc.nextInt();
			int M = sc.nextInt();
			sc.nextLine();
			String arr[] = new String[8];
			boolean flag = false;
			for(int i = 0; i < N; i++){
				String str = sc.nextLine();
				if(flag) continue;
				for(int j = M - 1; j >= 0; j--){
					if(str.charAt(j) == '1'){
						int idx = 7;
						while(idx >= 0){
							arr[idx--] = str.substring(j - 6, j + 1);
							j -= 7;
						}
						sb.append(solution(arr)).append("\n");
						flag = true;
						break;
					}
				}
			}
		}
		System.out.println(sb);
	}

	private static int solution(String[] arr){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("0001101", 0);
		map.put("0011001", 1);
		map.put("0010011", 2);
		map.put("0111101", 3);
		map.put("0100011", 4);
		map.put("0110001", 5);
		map.put("0101111", 6);
		map.put("0111011", 7);
		map.put("0110111", 8);
		map.put("0001011", 9);

		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < 8; i++){
			if(i % 2 == 0){
				sum1 += map.get(arr[i]);
			}else{
				sum2 += map.get(arr[i]);
			}
		}

		int answer = sum1 * 3 + sum2;
		if(answer % 10 == 0){
			answer = sum1 + sum2;
		}else{
			answer = 0;
		}

		return answer;
	}
}