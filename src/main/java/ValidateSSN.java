import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] strs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Credit card number");
        String str = sc.nextLine();
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
