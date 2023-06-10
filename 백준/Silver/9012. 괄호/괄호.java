import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int leftCount = 0;
        int rightCount = 0;
        List<String> words = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        List<String> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            words.add(br.readLine());
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if ('(' == words.get(i).charAt(j)) stack.push('(');
                if (')' == words.get(i).charAt(j)){
                    if(stack.isEmpty()) {
                        result.add("NO");
                        stack.push('n');
                        break;
                    }
                    stack.pop();
                }
                //System.out.print(stack.toString());
            }
            if (stack.isEmpty()) {
                result.add("YES");
                stack.clear();
                continue;
            }
            if(stack.peek() == 'n'){
                stack.clear();
                continue;
            }
            if (!stack.isEmpty()){
                result.add("NO");
                stack.clear();
                continue;
            }

        }
       
        
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }


    }
}
