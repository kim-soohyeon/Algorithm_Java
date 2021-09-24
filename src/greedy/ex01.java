package greedy;

public class ex01 {

	public static void main(String[] args) {
		// 거스름돈
		int n = 1260;
		int cnt = 0;
		int[] coin_types = {500, 100, 50, 10};
		
		for(int coin : coin_types) {
			cnt += n / coin;
			n %= coin;
		}
		
		System.out.println(cnt);
	}

}
