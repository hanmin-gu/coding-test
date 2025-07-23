class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int sHour=0;
        int sMin=0;
        
        int hour=0;
        int min=0;
        
        for(int i = 0; i < schedules.length; i++){
            int flag=1;
            int temp = startday;
            sHour = schedules[i] / 100;
            sMin = schedules[i] % 100;
            sMin +=10;
            
            if(sMin >= 60){
                sMin %= 60;
                sHour++;
            }
            
            for(int j = 0; j < 7; j++){
                if(temp % 7 == 6 || temp % 7 == 0){
                    temp++;
                    continue;
                }
                
                hour = timelogs[i][j] / 100;
                min = timelogs[i][j] % 100;
                
          
                if(!(sHour > hour || (sHour == hour && sMin >= min))){
                    flag=0;
                    break;
                }
                temp++;
            }
            
            if(flag == 1) answer++;
            
        }
        
        return answer;
    }
}