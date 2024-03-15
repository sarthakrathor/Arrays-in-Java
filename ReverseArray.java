package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arr.add(in.nextInt());
        }

        System.out.println("Original array: " + arr);
        reverse(arr);
        System.out.println("Reversed array: " + arr);
    }

    static void reverse(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;

        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
