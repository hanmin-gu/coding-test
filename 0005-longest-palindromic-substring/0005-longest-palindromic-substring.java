class Solution {
    public boolean palindromeCheck(String sentence){
        String palindrome = "";
        if(sentence.length() == 0) return false;
        int left = 0;
        int right = sentence.length() - 1;
        
        while(left < right){
            if(sentence.charAt(left++) != sentence.charAt(right--)) return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        List<String> words = new ArrayList<>();
        String result = "";
        //if(s.length() == 1) return s;
        for(int i = s.length(); 0 < i; i--){
            for(int j = 0; j <= s.length() - i; j++){
                if(palindromeCheck(s.substring(j,j + i))){
                    return s.substring(j,j+i);  
                }
            }
        }
        return result;
    }
}