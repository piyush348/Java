public class tower {
    public static void tow(int n, String src, String helper, String dest) {// move n disk from A to C from B
        if (n == 1) {
            System.out.println(" transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        tow(n - 1, src, dest, helper);

        System.out.println(" transfer disk " + n + " from " + src + " to " + helper);

        tow(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        tow(n, "S", "H", "D");
    }
}
