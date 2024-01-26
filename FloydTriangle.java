import java.util.Scanner;

public class FloydTriangle {
    public static void floyd_triangle(int n) {
        // outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd_triangle(7);
    }
}
