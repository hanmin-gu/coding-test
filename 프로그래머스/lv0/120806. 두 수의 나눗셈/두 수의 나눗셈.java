class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double result = num1 / (double) num2;
        answer = (int)(result * (double)1000);
        return answer;
    }
}