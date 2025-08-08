class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] map = {6, 6, 5, 4, 3, 2, 1};
        int match= 0;
        int none=0;
        
        for(int num : lottos){
            if(num == 0){
                none++;
            }
        }
        
        for(int l_num : lottos){
            if(l_num == 0) continue;
            boolean flag = false;
            for(int w_num : win_nums){
                if(l_num == w_num){
                    flag = true;
                    break;
                }
            }
            if(flag) match++;
        }
        
        answer[0]= map[match + none];
        answer[1] = map[match];
        
        return answer;
    }
}