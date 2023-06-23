

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        String[] numbers = sc.nextLine().split(" ");
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();
        String result = "YES";


        for (int i = 0; i < number; i++) {
            if (stack1.empty() || stack1.peek() < Integer.parseInt(numbers[i])) {
                stack1.push(Integer.parseInt(numbers[i]));
            } else if (stack2.empty() || stack2.peek() < Integer.parseInt(numbers[i])) {
                stack2.push(Integer.parseInt(numbers[i]));
            } else if (stack3.empty() || stack3.peek() < Integer.parseInt(numbers[i])) {
                stack3.push(Integer.parseInt(numbers[i]));
            } else if (stack4.empty() || stack4.peek() < Integer.parseInt(numbers[i])) {
                stack4.push(Integer.parseInt(numbers[i]));
            } else {
                result = "NO";
            }

        }


        if ("NO".equals(result)) System.out.println("NO");


        if ("YES".equals(result)) System.out.println("YES");
    }


}
