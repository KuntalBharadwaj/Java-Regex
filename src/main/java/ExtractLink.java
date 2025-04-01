import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String regex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(/\\s*)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
