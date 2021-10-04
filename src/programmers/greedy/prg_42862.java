package programmers.greedy;

import java.util.Arrays;

public class prg_42862 {

	public static void main(String[] args) {
		// 체육복
		int n = 5;
		int[] lost = {1, 2, 3};
		int[] reserve = {2, 3};
		
		System.out.println(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여벌 체육복을 가져온 학생이 도난 당한 경우
        for(int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if(lost[i] == reserve[j]) {
        			lost[i] = reserve[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        //여벌 체육복이 없는 학생이 도난 당한 경우
        for(int num : lost) {
        	if(num == -1) {
        		//여벌 체육복을 가져온 학생이 도난 당한 경우
        		continue;
        	}
        	for(int i = 0; i < reserve.length; i++) {
        		if(reserve[i] == num - 1 || reserve[i] == num + 1) {
        			reserve[i] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        return answer;
    }

}
