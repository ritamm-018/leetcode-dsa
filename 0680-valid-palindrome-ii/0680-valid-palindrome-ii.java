class Solution {
    public boolean samplePalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }

        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return samplePalindrome(s, i + 1, j) || samplePalindrome(s, i, j - 1);
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}