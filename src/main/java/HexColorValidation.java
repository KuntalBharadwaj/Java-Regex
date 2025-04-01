import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorValidation {
    public static void main(String[] args) {
        System.out.println("Enter the Hex Number");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String regex = "^#[[A-Fa-f][0-9]]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);

        System.out.println(matcher.matches());

    }
}
