class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int num = 1; num < n; num++){
            if(n % num == 1){
                answer = num;
                break;
            }
        }
        return answer;
    }
}