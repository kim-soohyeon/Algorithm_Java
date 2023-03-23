import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = new String[my_string.length()];
        int idx = 0;
        
        for(char chr: my_string.toCharArray()){
            if(chr >= 'A' && chr <= 'Z'){
                arr[idx++] = Character.toString(chr + 'a' - 'A');
            }else{
                arr[idx++] = Character.toString(chr);
            }
        }
        
        Arrays.sort(arr);        
        
        return String.join("", arr);
    }
}