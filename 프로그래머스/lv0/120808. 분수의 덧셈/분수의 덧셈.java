class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int min = (numer < denom) ? numer : denom;
        int nums = 0;
        
        for(int i=1; i< min+1; i++){
            if((numer % i) == 0 && (denom % i) == 0){
                nums = i;
            }
        }
        answer[0] = numer / nums;
        answer[1] = denom / nums;
        
        return answer;
    }
}