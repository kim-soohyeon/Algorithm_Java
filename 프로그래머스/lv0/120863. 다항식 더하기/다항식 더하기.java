class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0; i < arr.length; i += 2){
            // System.out.println(arr[i]);
            if(arr[i].contains("x")){
                if(arr[i].length() > 1){
                    num1 += Integer.parseInt(arr[i].replace("x",""));
                    // System.out.println(num);
                }else{
                    num1++;
                }       
            }else{
                num2 += Integer.parseInt(arr[i]);
            }
        }
        
        if(num1 > 0){
            if(num1 > 1){
                answer += Integer.toString(num1);
            }            
            answer += "x";
            if(num2 > 0){
                answer += " + ";
                answer += Integer.toString(num2);
            }
        }else{
            answer += Integer.toString(num2);
        }
        
        return answer;
    }
}