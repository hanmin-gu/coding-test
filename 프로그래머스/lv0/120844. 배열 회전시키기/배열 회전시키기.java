import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        Integer element = 0;
        Deque<Integer> number = new ArrayDeque<>();
        for(int num : numbers){
            number.addLast(num);
        }
        
    
        if("right".equals(direction)){
            element = number.getLast();
            number.removeLast();
            number.addFirst(element);
            }
        if("left".equals(direction)){
            element = number.getFirst();
            number.removeFirst();
            number.addLast(element);
        }
        for(int i=0; i < numbers.length; i++){
            answer[i]= number.poll();
        }
        
        return answer;
    }
}