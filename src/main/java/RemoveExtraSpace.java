public class RemoveExtraSpace {
    public static String removeExtraSpaces(String input) {
        return input.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String inputText = "This  is   an example    with multiple    spaces.";
        String result = removeExtraSpaces(inputText);
        System.out.println(result);
        // Output: "This is an example with multiple spaces."
    }
}
