import java.util.*;
class Solution{
    public String solution(String s) {
        String answer = "";
        List<String> words = Arrays.asList(s.split(""));
        List<String> result = new ArrayList<>();
        char[] chars;
        
        for(String word : words){
            if(1 == Collections.frequency(words, word)) answer += word;   
        }
        
        chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        return answer;
    }
}