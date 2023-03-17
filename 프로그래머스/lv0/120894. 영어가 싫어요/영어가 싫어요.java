import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        
        for(int i = 0; i < strArr.length; i++){
            if(numbers.contains(strArr[i])){
                numbers = numbers.replace(strArr[i], i + ""); //치환
            }
            
            try{
                answer = Long.parseLong(numbers);
                break;
            }
            catch (NumberFormatException ex){
                continue;
            }
        }

        return answer;
    }
}