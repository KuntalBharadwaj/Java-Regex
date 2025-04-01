import java.util.List;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static String censorText(String input, List<String> badWords) {
        for (String badWord : badWords) {
            // Create a case-insensitive regex pattern for whole words
            String regex = "\\b" + Pattern.quote(badWord) + "\\b";
            input = input.replaceAll("(?i)" + regex, "****");
        }
        return input;
    }

    public static void main(String[] args) {
        String inputText = "This is a damn bad example with some stupid words.";
        List<String> badWordsList = List.of("damn", "stupid");

        String result = censorText(inputText, badWordsList);
        System.out.println(result);
        // Output: "This is a **** bad example with some **** words."
    }
}
