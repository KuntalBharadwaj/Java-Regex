import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String regex = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+/.[a-zA-Z._-]{2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
