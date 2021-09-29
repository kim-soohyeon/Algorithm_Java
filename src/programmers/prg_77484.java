package programmers;

public class prg_77484 {

	public static void main(String[] args) {
		//로또의 최고 순위와 최저 순위
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		System.out.println(solution(lottos, win_nums));
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {0, 0};
		int zero = 0;
		
		for(int lotto : lottos) {
			if(lotto == 0) {
				zero++;
			}
			for(int num : win_nums) {
				if(lotto == num) {
					answer[1]++;
				}
			}
		}
		answer[0] = answer[1] + zero;
		
		for(int i = 0; i < 2; i++) {
			switch(answer[i]) {
				case 6:
					answer[i] = 1;
					break;
				case 5:
					answer[i] = 2;
					break;
				case 4:
					answer[i] = 3;
					break;
				case 3:
					answer[i] = 4;
					break;
				case 2:
					answer[i] = 5;
					break;
				default:
					answer[i] = 6;
					break;
			}

		}
		
        return answer;
    }

}
