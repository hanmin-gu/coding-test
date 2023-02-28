class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length() + 1;
        int Plength=p.length();
        long number=Long.parseLong(p);
        long[] num=new long[length];
        for(int i=0; i<length; i++){
            num[i]=Long.parseLong(t.substring(i,Plength));
            Plength++;
        }
        for(int j=0; j<length; j++){
            if(num[j]<=number) answer++;
        }
        return answer;
    }
}