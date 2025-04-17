import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("x = ");
        int x = sc.nextInt();

        boolean palindrome = isPalindrome(x);

        System.out.println(palindrome);
    }
}