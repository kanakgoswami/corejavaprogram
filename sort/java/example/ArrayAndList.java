package sort.java.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAndList {
    public static void main(String args[]) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        /////////////////////////////////
        List<Integer> unsorted = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
        List<Integer> sorted = unsorted.stream()
                .sorted().collect(Collectors.toList());
        List<Integer> sortedList = unsorted.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        sorted.forEach(System.out::println);
        /////////////////////////////

    }
}
