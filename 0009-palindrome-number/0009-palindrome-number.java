class Solution {
    public boolean isPalindrome(int x) {
        
        String numbers = String.valueOf(x);
        String left = numbers.substring(0, numbers.length() / 2);
        String right = "";
        String reverse= "";
        
        
        if(numbers.length() % 2 == 1) right = numbers.substring((numbers.length() / 2) + 1 ); //, numbers.length() );
        
        if(numbers.length() % 2 == 0) right = numbers.substring(numbers.length() / 2);
        
        for(int i = right.length() - 1; 0 <= i; i--){
            reverse += right.charAt(i);
        }
        
        if(left.equals(reverse)) return true;
        
        return false;
    }
}