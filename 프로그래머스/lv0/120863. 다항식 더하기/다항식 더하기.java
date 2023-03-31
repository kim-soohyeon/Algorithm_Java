class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int num1 = 0;//일차항
        int num2 = 0;//상수항

        for(int i = 0; i < arr.length; i += 2){
            if(arr[i].contains("x")){
                //일차항
                if(arr[i].length() > 1){
                    num1 += Integer.parseInt(arr[i].replace("x",""));
                }else{
                    num1++;
                }       
            }else{
                //상수항
                num2 += Integer.parseInt(arr[i]);
            }
        }

        if(num1 > 0){
            //일차항이 있는 경우
            if(num1 > 1){
                //계수 1은 생략
                answer += Integer.toString(num1);
            }            
            answer += "x";
            if(num2 > 0){
                answer += " + ";
                answer += Integer.toString(num2);
            }
        }else{
            //일차항이 없는 경우
            answer += Integer.toString(num2);
        }

        return answer;
    }
}