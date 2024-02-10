public class sumnatural {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        sum(n - 1);
        int Sn = n + sum(n - 1);
        return Sn;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(sum(n));
    }
}
