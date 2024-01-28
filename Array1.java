import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        // Array- It is a list of the same type
        // placed in a contiguous memory location.
        // Creating an array
        // dataType arrayName[] = new dataType[size];
        // int marks[] = new int[50];

        // int number[]={1,2,3};

        int marks[] = new int[100];

        try (Scanner sc = new Scanner(System.in)) {
            // marks[0] = sc.nextInt();
            // marks[1] = sc.nextInt();
            // marks[2] = sc.nextInt();

            System.out.println("Lemgth of array" + marks.length);
            // System.out.println("phy : " + marks[0]);
            // System.out.println("chem : " + marks[0]);
            // System.out.println("maths : " + marks[0]);
        }

    }
}
