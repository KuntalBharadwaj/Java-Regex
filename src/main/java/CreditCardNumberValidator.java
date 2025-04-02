import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardNumberValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the which card we want to validate visa or master card");
        String s = sc.nextLine();
        if(s.equals("visa")) {
            System.out.println("Enter the Credit card number");
            String str = sc.nextLine();
            String regex = "^4[0-9]{15}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }

        else if(s.equals("master")) {
            System.out.println("Enter the Credit card number");
            String str = sc.nextLine();
            String regex = "^5[0-9]{15}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }
        else {
            System.out.println("we have to choose either visa or master");
        }
    }
}
