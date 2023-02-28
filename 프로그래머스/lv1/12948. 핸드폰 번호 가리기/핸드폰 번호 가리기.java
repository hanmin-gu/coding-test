class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i=0; i < phone_number.length(); i++){
            if(i < phone_number.length() - 4) str.append("*");
            if(i >= phone_number.length() - 4) str.append(phone_number.charAt(i));
        }
        answer = str.toString();
        return answer;
    }
}