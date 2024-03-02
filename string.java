public class string {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        // concatination

        String firstName = "Piyush";
        String lastName = "Chaturvedi";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName + " is this.");
        printLetters(fullName);
    }
}