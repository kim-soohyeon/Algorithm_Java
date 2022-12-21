import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int[] answer = new int[26];
		for(int i = 0; i < answer.length; i++) {
			// �迭 �ʱ�ȭ
			answer[i] = -1;
		}
		for(int j = 0; j < s.length(); j++) {
			// ��ġ ã��
			if(answer[s.charAt(j) - 'a'] <= -1) {
				answer[s.charAt(j) - 'a'] = j;
			}
		}
		
		for(int val : answer) {
			// ��� ���
			sb.append(val + " ");
		}
		System.out.print(sb);
		
		br.close();
	}

}
