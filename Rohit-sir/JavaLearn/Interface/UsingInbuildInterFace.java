
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingInbuildInterFace {

    public void usingPredicate() {
        Predicate<String> isValidPalindrome = (a) -> {
            int i = 0;
            int j = a.length() - 1;
            char[] arr = a.toCharArray();
            while (i < j) {
                if (arr[i] != arr[j]) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        };
        System.out.println(isValidPalindrome.test("SaS"));
    }

    public static void main(String[] args) {
        Consumer<String> consume = (str) -> {
            String b = str;
            Predicate<String> isValidPalindrome = (a) -> {
                int i = 0;
                int j = a.length() - 1;
                char[] arr = a.toCharArray();
                while (i < j) {
                    if (arr[i] != arr[j]) {
                        return false;
                    }
                    i++;
                    j--;
                }
                System.out.println(b);
                return true;
            };
            if (isValidPalindrome.test(str)) {
                System.out.println("Given String is Valid Palindrome " + str);
            } else {
                System.out.println("Given String is not Valid Palindrome " + str);
            }

        };
        Function<String, Supplier<String>> validate = (str) -> {
            String a = str;
            Supplier<String> isValidPalindrome = () -> {

                return a;
            };
            return isValidPalindrome;

        };
        System.out.println(validate.apply("SAS").get());

    }
}
