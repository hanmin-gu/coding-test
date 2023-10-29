import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        String[] answer = new String[players.length];
     
        int index = 0;
        
        String frontWord = "";
        String backWord = "";
    
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(int j = 0; j < callings.length; j++){
            index = map.get(callings[j]);
            //System.out.println(index);
            
            frontWord = players[index - 1];
            backWord = players[index];
            
            map.replace(players[index] , index - 1);
            map.replace(players[index - 1], index);
            
            players[index - 1] = backWord;
            players[index] = frontWord;
                
        }
        
        
        for(int i = 0; i < players.length; i++){
            answer[i] = players[i]; 
        }
        return answer;
    }
}