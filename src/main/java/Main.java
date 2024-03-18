import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static String squareString(String input) {
        StringBuilder result = new StringBuilder();

        String[] parts = input.split(" ");

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                result.append(num * num).append(" ");
            } catch (NumberFormatException ignored) {

            }
        }
        return result.toString().trim();
    }
    public static String squareString2(String str) {
        return Arrays.stream(str.split(" "))
                .filter(s -> s.matches("\\d+"))
                .map(s -> String.valueOf(Integer.parseInt(s) * Integer.parseInt(s)))
                .collect(Collectors.joining(" "));

    }

    public static String squareString3(String str) {
        return Arrays.stream(str.split(" ")).parallel()
                .filter(s -> s.matches("\\d+"))
                .map(s -> String.valueOf(Integer.parseInt(s) * Integer.parseInt(s)))
                .collect(Collectors.joining(" "));

    }

    public static void main(String[] args) {
        System.out.println(squareString("1 sgs / 2 3 5"));
        System.out.println(squareString2("1 sgs / 2 3 5"));
        System.out.println(squareString3("1 sgs / 2 3 5"));
    }
}
