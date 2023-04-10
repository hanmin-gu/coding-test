import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static String Reverse(List<String> sentence){
        List<String> newSentence = new ArrayList<>(sentence);
        Collections.reverse(newSentence);
        return newSentence.toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = "";
        text = br.readLine();
        int palindromeCount = 0;

        List<String> words = new ArrayList<>();

        words = Arrays.asList(text.split(""));


        for(int i=0; i < text.length()/2; i++) {
            if (Reverse(words).equals(words.toString())) {
                //System.out.print(words.size());
                break;
            }
            words.add(words.get(palindromeCount));
            palindromeCount++;

        }
    }
}













