import java.util.Arrays;

public class MergeString {
    public static void mergeSort(String[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(String[] arr, int left, int mid, int right) {
        int p1 = left, p2 = mid + 1, p3 = 0;
        String[] res = new String[right - left + 1];
        while (p1 <= mid && p2 <= right) {
            if (arr[p1].compareTo(arr[p2]) <= 0) {
                res[p3] = arr[p1];
                p1++;
                p3++;
            } else {
                res[p3] = arr[p2];
                p2++;
                p3++;
            }
        }
        while (p1 <= mid) {
            res[p3] = arr[p1];
            p1++;
            p3++;
        }
        while (p2 <= right) {
            res[p3] = arr[p2];
            p2++;
            p3++;
        }
        for (int idx = 0; idx < res.length; idx++) {
            arr[idx + left] = res[idx];
        }

    }

    public static void main(String[] args) {
        String[] arr = { "Sun", "earth", "mars", "mercury", "jupitar", "saturn", "uranus" };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
