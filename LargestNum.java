import java.util.Scanner;

public class LargestNum {
    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i <= numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 5, 4 };
        System.out.println("Largest number is : " + largestNumber(number));
    }
}
