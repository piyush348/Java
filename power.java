public class power {
    public static int pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        if (y == 1) {
            return x;
        }
        int smallerAns = pow(x, y - 1);
        int ans = x * smallerAns;

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
}
