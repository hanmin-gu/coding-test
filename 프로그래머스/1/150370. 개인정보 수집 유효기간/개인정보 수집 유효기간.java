import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int todayDays = toDays(today);

 
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

     
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            String termType = parts[1];

            int collectedDays = toDays(date);
            int termMonths = termMap.get(termType);
            int expiryDays = collectedDays + (termMonths * 28) - 1;

            if (expiryDays < todayDays) {
                result.add(i + 1); 
            }
        }

        return result;
    }

 
    private int toDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }
}