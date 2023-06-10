import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> orders = new ArrayList<>();
        String answer = "";
        String Input = "";
        int result = 0;
        List<String> operators = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        do {
            Input=br.readLine();
            orders.add(Input);

        } while (!("=".equals(Input)));

        for (String word : orders) {
            if ("+".equals(word) || "-".equals(word) || "*".equals(word) || "/".equals(word) || "=".equals(word)) {
                operators.add(word);
                continue;
            }
            numbers.add(Integer.parseInt(word));
        }
        result = numbers.get(0);

        for (int i = 1; i < operators.size(); i++) {
            if ("+".equals(operators.get(i - 1))) result += numbers.get(i);
            if ("-".equals(operators.get(i - 1))) result -= numbers.get(i);
            if ("*".equals(operators.get(i - 1))) result *= numbers.get(i);
            if ("/".equals(operators.get(i - 1))) result /= numbers.get(i);
            if ("=".equals(operators.get(i - 1))) break;
        }

        System.out.println(result);
    }
}
