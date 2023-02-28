class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);
        System.out.println(str);
        for(int i=0; i<str.length(); i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        if(x % sum != 0) answer = false;
        
        return answer;
    }
}