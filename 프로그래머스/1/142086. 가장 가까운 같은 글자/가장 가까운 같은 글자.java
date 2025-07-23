import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<Character> spellings=new ArrayList<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(!spellings.contains(s.charAt(i))){
            spellings.add(s.charAt(i));
            answer[i]= -1;
            continue;
            }
        
            for(int j=i-1; j>=0; j--){
                if(s.charAt(j)==s.charAt(i)){ count=i-j; break;}
            }
                answer[i]=count;
        }
        return answer;
    }
}