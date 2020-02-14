import org.apache.commons.lang3.*;
import java.util.Scanner;

public class MavenTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter something.");
        String str = s.nextLine();
        if (StringUtils.isNumericSpace(str)) {
            System.out.printf("%s is numeric!\n", str);
        } else {
            System.out.printf("%s is not numeric or has a '-' sign in front.\n", str);
        }
        System.out.printf("Your string with flipped case is: %s.\n", StringUtils.swapCase(str));
        System.out.printf("Your string reversed is: %s.\n", StringUtils.reverse(str));

    }
    public static int add (int n1, int n2) {
        return n1 + n2;
    }
}
