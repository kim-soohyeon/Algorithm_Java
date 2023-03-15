class Solution {
    public int solution(int[] array, int n) {
        int arr[] = new int[array.length];
        
        // 두 수의 차 구하기
        for(int i = 0; i < array.length; i++){
            if(array[i] >= n){
                arr[i] = array[i] - n;
            }else{
                arr[i] = n - array[i];
            }
        }
        
        // 두 수의 차가 가장 작은 인덱스값 구하기
        int minIdx = 0; 
        for(int i = 1; i < arr.length; i++){
            if(arr[minIdx] > arr[i]){
                minIdx = i;
            }else if(arr[minIdx] == arr[i]){
                // 차가 같은 경우, 더 작은 수 리턴
                if(array[minIdx] > array[i]){
                    minIdx = i;
                }
            }
        }
        
        return array[minIdx];
    }
}