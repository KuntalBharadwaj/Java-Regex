import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPlateValidation {
    public static void main(String[] args) {
        System.out.println("Enter the Number Plate Number");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);

        System.out.println(matcher.matches());

    }
}
