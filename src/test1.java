import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test1 {

	private static void solution(int numOfOperation, Operation[] operations) {
		// TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
		ArrayList<Integer> answer = new ArrayList<Integer>();
		ArrayList<Integer> merge = new ArrayList<Integer>();
		
		int num = 1;
		answer.add(num++);
		
		for (int i = 0; i < numOfOperation; i++) {
			if (OperationType.merge == operations[i].type) {
				//merge인 경우
				merge.add(operations[i].value);
				answer.remove(Integer.valueOf(operations[i].value));//ArrayList특정 값 삭제하기 - 출처(https://hianna.tistory.com/564)
			}else {
				//branch인 경우
				if(merge.size() > 0) {
					Collections.sort(merge);//오름차순 정렬
					answer.add(merge.get(0));
					merge.remove(0);
				}else {
					answer.add(num++);
				}
			}
		}
		
		Collections.sort(answer);//오름차순 정렬
		for(int ans : answer) {
			System.out.print(ans + " ");
		}
	}

	private static class InputData {
		int numOfOperation;
		Operation[] operations;
	}

	private static class Operation {
		OperationType type;
		Integer value;

		public Operation(OperationType type, Integer value) {
			this.type = type;
			this.value = value;
		}
	}

	private static enum OperationType {
		branch,
		merge;
	}

	private static InputData processStdin() {
		InputData inputData = new InputData();

		try (Scanner scanner = new Scanner(System.in)) {
			inputData.numOfOperation = Integer.parseInt(scanner.nextLine());
			inputData.operations = new Operation[inputData.numOfOperation];

			for (int i = 0; i < inputData.numOfOperation; i++) {
				String[] temp = scanner.nextLine().split(" ");

				Integer value = null;
				OperationType operationType = OperationType.valueOf(temp[0]);
				if (OperationType.merge == operationType) {
					value = Integer.valueOf(temp[1]);
				}

				inputData.operations[i] = new Operation(operationType, value);
			}
		} catch (Exception e) {
			throw e;
		}

		return inputData;
	}

	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();

		solution(inputData.numOfOperation, inputData.operations);
	}

}
