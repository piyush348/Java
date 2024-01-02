import java.util.*;

public class SquareArea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int side = sc.nextInt();
            int Area = side * side;
            System.out.println("Area of square is : " + Area);
        }
    }
}
