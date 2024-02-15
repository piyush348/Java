public class keypad {
    final static char[][] L = {
            {},
            {},
            { 'a', 'b', 'c' },
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' },
            { 'j', 'k', 'l' },
            { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' },
            { 'w', 'x', 'y', 'z' }
    };

    public static void letterCombinations(String givenString) {
        int len = givenString.length();
        if (len == 0) {
            System.out.println("null");
            return;
        }
        recursive_func(0, len, " ", givenString);
    }

    public static void recursive_func(int pos, int len, String outputString, String givenString) {
        if (pos == len) {
            System.out.println(outputString);
        } else {
            char[] letters = L[givenString.charAt(pos) - '0'];
            for (int i = 0; i < letters.length; i++) {
                recursive_func(pos + 1, len, outputString + letters[i], givenString);
            }
        }
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
