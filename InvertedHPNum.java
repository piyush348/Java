import java.util.Scanner;

public class InvertedHPNum {
    public static void invert_half_pyramid(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // // spaces
            // for (int j = 1; j <= n; j++) {
            // System.out.print(" ");
            // }
            // stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invert_half_pyramid(5);
    }
}
