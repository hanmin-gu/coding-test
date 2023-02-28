class Solution {
    public long solution(long n) {
        long answer = -1;
        if(n == Math.pow((int)Math.sqrt(n), 2)){
            answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
        return answer;
    }
}