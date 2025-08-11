class Solution {
    public String mergeAlternately(String word1, String word2) {
        String answer = "";

        int i = 0;
        int j = 0;
        while(answer.length() < word1.length() + word2.length()){
            if(i < word1.length()){
                answer += word1.charAt(i++);
            }
            if(j < word2.length()){
                answer += word2.charAt(j++);
            }
        }

        return answer;
    }
}