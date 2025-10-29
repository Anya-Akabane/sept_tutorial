package hanh;

import java.util.Arrays;


public class App {
    private static BubbleShort BubbleSort;

    public static void main(String[] args) {
        Integer[] a = {70, 61, 72, 83, 38};
        Integer[] b = {7, 2, 76, 4, 99};
        Integer[] c = {28, 9, 13, 78, 19};
        Integer[] d = {68, 84, 41, 62, 18};
        Integer[] e = {37, 57, 40, 13, 50};

        System.out.println("a) " + Arrays.toString(BubbleSort.sort(a)));
        System.out.println("b) " + Arrays.toString(BubbleSort.sort(b)));
        System.out.println("c) " + Arrays.toString(BubbleSort.sort(c)));
        System.out.println("d) " + Arrays.toString(BubbleSort.sort(d)));
        System.out.println("e) " + Arrays.toString(BubbleSort.sort(e)));
    }
}
