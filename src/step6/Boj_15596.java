package step6;

public class Boj_15596 {
	//	정수 N개의 합
	long sum(int[] a) {
		long sum = 0;//배열의 합
		
		for(int value : a) {
			sum += value;
		}
		
		return sum;
	}
}
