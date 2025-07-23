import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] HOF = new int[k];
        int h_i=0;
        int a_i=0;
        
        for(int i = 0; i < score.length; i++){
            if (h_i < k) {
                HOF[h_i++] = score[i];
            } else if (score[i] > HOF[k - 1]) {
                HOF[k - 1] = score[i];  // 최소값보다 클 때만 갱신
            }
        
            for(int q=0; q<k -1; q++){
                for(int o=0; o<k-q-1; o++){
                    if(HOF[o] < HOF[o+1]){
                        int temp = HOF[o];
                        HOF[o] = HOF[o+1];
                        HOF[o+1] = temp;
                    }
                }
            }
            
            //System.out.println(Arrays.toString(HOF));
            
           answer[i] = HOF[h_i < k ? h_i - 1 : k - 1];  
        }
        
            
            
        
        
        
        return answer;
    }
}
    
