class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        for(String q : quiz){
            String[] arr = q.split(" ");
            int hap = Integer.parseInt(arr[0]);            
            for(int i = 1; i < arr.length; i+=2){
                if(arr[i].equals("-")){
                    // -
                    hap -= Integer.parseInt(arr[i + 1]);
                }else if(arr[i].equals("+")){
                    // +
                    hap += Integer.parseInt(arr[i + 1]);
                }else{
                    // =
                    if(hap == Integer.parseInt(arr[i + 1])){
                        answer[idx++] = "O";
                    }else{
                        answer[idx++] = "X";
                    }
                    
                    if(i + 1 < arr.length){
                        hap = Integer.parseInt(arr[i + 1]);
                    }
                }
            }
        }
        return answer;
    }
}