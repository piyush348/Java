import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n = 119384;
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);

            n = n / 10;
        }
        System.out.println();
    }
}
