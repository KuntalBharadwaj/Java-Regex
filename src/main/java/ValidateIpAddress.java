import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidateIpAddress{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
