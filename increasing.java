public class increasing {
    public static void increasenum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increasenum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        increasenum(n);
    }
}
