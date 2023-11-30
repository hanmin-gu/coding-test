class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int curHealth = health;
        int time = 0;
        int count = 0;
        int index = 0;
        int qure = bandage[1];
        
        while(index < attacks.length){

            time++;
            
            if(attacks[index][0] == time){
                curHealth -= attacks[index][1];
                if(curHealth <= 0) return -1;
                
                count = 0;
                index++;
                continue;
            }        
  

            if(curHealth < health){
                curHealth += qure;
                
                if(curHealth > health) curHealth = health;
                
                count++;
                
            }
            
            if(count == bandage[0]){
                curHealth += bandage[2];
                if(curHealth > health) curHealth = health;
                count = 0;
        
            }
        }
        
        answer = curHealth;
        return answer;
    }
}