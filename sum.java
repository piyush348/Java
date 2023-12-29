import java.util.*;

public class sum {
    public static void main(String[] args) {

        // Inputs in java---- next, nextLine, nextInt, nextByte, nextByte, nextFloat,
        // nextDouble, nextBoolean, nextShort, nextSLong
        // int a = 10;
        // int b = 20;
        // int sum = a + b;
        // System.out.println(sum);

        // try (Scanner sc = new Scanner(System.in)) {
        // String input = sc.next();
        // System.out.println(input);
        // }

        // try (Scanner sc = new Scanner(System.in)) {
        // int number = sc.nextInt();
        // System.out.println(number);
        // }

        // try (Scanner sc = new Scanner(System.in)) {
        // String name = sc.nextLine();
        // System.out.println(name);
        // }

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }

    }
}
