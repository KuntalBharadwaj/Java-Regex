import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String regex = "(0[1-9]|[12][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
