import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Enter the user name");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);

        System.out.println(matcher.matches());

    }
}
