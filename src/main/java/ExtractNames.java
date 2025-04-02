import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> ProgrammingWord = new ArrayList<>();
        ProgrammingWord.add("Java");
        ProgrammingWord.add("Python");
        ProgrammingWord.add("JavaScript");
        ProgrammingWord.add("Go");

        System.out.println(Pattern.quote(String.valueOf(ProgrammingWord)));
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C|Dart)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
