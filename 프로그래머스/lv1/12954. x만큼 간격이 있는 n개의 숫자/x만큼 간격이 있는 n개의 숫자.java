class Solution {
    public long[] solution(int x, int n) {
        if(n ==0) return new long[1];
        long[] answer = new long[n];
        for(int i = 1; i <= n; i++){
            answer[i-1] = ((long)x * i);
        }
        return answer;
    }
}