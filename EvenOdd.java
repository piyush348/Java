
public class EvenOdd {
    public static void OddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(11);
        OddorEven(12);
    }
}
