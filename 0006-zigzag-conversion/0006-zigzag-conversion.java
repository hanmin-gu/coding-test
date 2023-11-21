class Solution {
    public String convert(String s, int numRows) {
        Character[][] conversion = new Character[numRows][s.length() * 2];
        int index = 0;
        int x = 0;
        int y = 0;
        String answer = "";
        
        
        while(index < s.length()){
            if(x % 2 == 0){
                for(int i = 0; i < numRows; i++){
                    if(index == s.length()) break;
                    conversion[i][x] = s.charAt(index++);
                    
                }
                x++;
            }
            if((x % 2) == 1){
                for(int i = numRows - 2;  1 <= i; i--){
                    if(index == s.length()) break;
                    conversion[i][x] = s.charAt(index++);
                }
                x++;   
            }
        }
        
        for(int i =0; i < conversion.length; i++){
            for(int j = 0; j<conversion[0].length; j++){
                if(conversion[i][j] == null) continue;
                answer += conversion[i][j];
            }
        }
        
        
        
        return answer;
    }
}