class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        
        if(str.equals(revStr)) return true;

        return false;
    }
}