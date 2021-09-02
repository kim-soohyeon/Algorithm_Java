package step6;

public class Boj_4673 {

	public static void main(String[] args) {
		//셀프 넘버
		boolean[] arr = new boolean[10001];//1~10000까지
		
		for(int i = 1; i <= 10000; i++) {
			int num = d(i);
			
			if(num <= 10000) {//10000보다 작거나 같을 때
				arr[num] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 10000; i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
				
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int n) {
		int sum = n;
		
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}

}
