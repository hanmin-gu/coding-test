class Solution {
    public int[] solution(int n) {
    
        double ArraySize = (double)n/2;
        int[] answer = new int[(int)(ArraySize+0.6)];
        int count =0;
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                answer[count] = i;
                count++;
            }
            
        }
        return answer;
    }
}