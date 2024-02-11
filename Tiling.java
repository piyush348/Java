public class Tiling {
    public static int tillingProblem(int n) {
        // base
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        int fnm1 = tillingProblem(n - 1);
        // horizontal
        int fnm2 = tillingProblem(n - 2);

        // total ways
        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(5));
    }
}
