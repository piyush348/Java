import java.util.Scanner;

public class product {
    public static void product(int a, int b) {
        int result = a * b;
        System.out.println("Product is " + result);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            product(a, b);
        }
    }
}
