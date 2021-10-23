import java.util.Scanner;

public class test3 {
	
	private static void solution(int numOfConflict, int[][] conflicts) {
		// TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
	}

	private static class InputData {
		int numOfConflict;
		int[][] conflicts;
	}

	private static InputData processStdin() {
		InputData inputData = new InputData();

		try (Scanner scanner = new Scanner(System.in)) {
			inputData.numOfConflict = Integer.parseInt(scanner.nextLine());
			inputData.conflicts = new int[inputData.numOfConflict][2];

			for (int i = 0; i < inputData.numOfConflict; i++) {
					String[] temp = scanner.nextLine().split(" ");
					inputData.conflicts[i][0] = Integer.parseInt(temp[0]);
					inputData.conflicts[i][1] = Integer.parseInt(temp[1]);
			}
		} catch (Exception e) {
			throw e;
		}

		return inputData;
	}

	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();

		solution(inputData.numOfConflict, inputData.conflicts);
	}
}