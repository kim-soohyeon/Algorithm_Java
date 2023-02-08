class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom1 * denom2;
        
        int max = answer[0];
        int min = answer[1];
        if(max < answer[1]){
            max = answer[1];
            min = answer[0];
        }
        
        //유클리드 호제법
        // int num =  max % min;
        int tmp;
        while(min > 0){
            tmp = max % min;
            max = min;
            min = tmp;
            // if(min % num == 0){
            //     break;
            // }
            // num = min % num;
        }
        
        answer[0] /= max;
        answer[1] /= max;
        
        return answer;
    }
}