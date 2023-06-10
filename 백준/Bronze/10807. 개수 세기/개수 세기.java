import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String input = "";
        List<String> numbers = new ArrayList<>();
        String searchNumber = "";

        input = br.readLine();


        numbers = Arrays.asList(input.split(" "));
 


        searchNumber = br.readLine();

        count = Collections.frequency(numbers, searchNumber);
        System.out.println(count);

    }
}
