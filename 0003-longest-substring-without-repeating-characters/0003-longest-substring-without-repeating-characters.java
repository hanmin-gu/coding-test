class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        String word = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(list.contains(s.charAt(j))) break;
                 list.add(s.charAt(j));
            }
            result.add(list.size());
            list.clear();
        }
        if(result.isEmpty()) return 0;
        return Collections.max(result);
    }
}
