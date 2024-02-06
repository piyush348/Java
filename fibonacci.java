public class fibonacci {
    public static int fibb(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int fnm1 = fibb(n - 1);
            int fnm2 = fibb(n - 2);
            int FN = fnm1 + fnm2;
            return FN;

        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibb(n));
    }
}
