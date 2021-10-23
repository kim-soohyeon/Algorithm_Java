package test_1023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test2 {
	
	private static void solution(int numOfRegion, int numOfAttackableFrequency, int[][] frequencies) {
		// TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
		int[] arr = new int[21];
		
		class Frequencies implements Comparable<Frequencies>{
			
			private int num;
			private int frequency;
			
			public Frequencies (int num, int frequency) {
				
				this.num = num;
				this.frequency = frequency;
			}
			
			public int compareTo(Frequencies fre) {
			     if (this.frequency < fre.frequency) {
			         return 1;
			     } else if (this.frequency == fre.frequency) {
			         return 0;
			     } else {
			         return -1;
			     }
			 }
		}
		
		for (int i = 0; i < numOfRegion; i++) {
			for(int fre : frequencies[i]) {
				arr[fre]++;
			}
		}
		ArrayList<Frequencies> answer = new ArrayList<Frequencies>();
		for(int i = 1; i < 21; i++) {
			if(arr[i] > 0) {
				answer.add(new Frequencies(i, arr[i]));
			}
		}
		
		Collections.sort(answer);
		ArrayList<Integer> freq = new ArrayList<Integer>();
		for (int i = 0; i < numOfAttackableFrequency; i++) {
			freq.add(answer.get(i).num);
		}
		
		int cnt = 0;
		for(int i = 0; i < numOfRegion; i++) {
			for(int value : frequencies[i]) {
				if(freq.contains(value)) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

	private static class InputData {
		int numOfRegion;
		int numOfAttackableFrequency;
		int[][] frequencies;
	}

	private static InputData processStdin() {
		InputData inputData = new InputData();

		try (Scanner scanner = new Scanner(System.in)) {
			String[] temp = scanner.nextLine().split(" ");
			inputData.numOfRegion = Integer.parseInt(temp[0]);
			inputData.numOfAttackableFrequency = Integer.parseInt(temp[1]);
			inputData.frequencies = new int[inputData.numOfRegion][];

			for (int i = 0; i < inputData.numOfRegion; i++) {
				temp = scanner.nextLine().split(" ");

				int numOfFrequency = Integer.valueOf(temp[0]);
				inputData.frequencies[i] = new int[numOfFrequency];
				for (int j = 0; j < numOfFrequency; j++) {
					inputData.frequencies[i][j] = Integer.parseInt(temp[j + 1]);
				}
			}
		} catch (Exception e) {
			throw e;
		}

		return inputData;
	}

	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();

		solution(inputData.numOfRegion, inputData.numOfAttackableFrequency, inputData.frequencies);
	}
}