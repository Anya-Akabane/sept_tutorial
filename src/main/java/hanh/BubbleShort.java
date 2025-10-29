package hanh;

public class BubbleShort {
    public static Integer[] sort(Integer[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    Integer tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                    swapped = true;
                }
            }
            n--; // last element in this pass is in correct place
        } while (swapped);
        return arr;
    }
}
