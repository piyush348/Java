public class SubarraySum {
    public static void printSubArraySum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 1; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // print subarray sum
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 5, 6, 7 };
        printSubArraySum(number);
    }
}