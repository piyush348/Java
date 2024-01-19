import java.util.Scanner;

//Function Overloading- Multiple functions with same name but differnt parameters.
public class functions {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));
    }
}

// public class functions {
// // public static void calculateSum(int a, int b) {

// // int sum = a + b;
// // System.out.println("Sum is " + sum);
// // }

// public static void main(String[] args) {
// // try (Scanner sc = new Scanner(System.in)) {
// // int a = sc.nextInt();
// // int b = sc.nextInt();
// // calculateSum(a, b);
// }
// }
