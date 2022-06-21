import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class EvenOdd {
    public static void main(String args[]) {
        int a[] = { 1, 2, 5, 6, 3, 2 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("Even  :" + a[i]);
            }
            if (a[i] % 2 == 0) {
                System.out.println("Odd   :" + a[i]);
            }
        }
        //////////////////////////////////////////////////////////////////////////////////
        List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
        List<Integer> evenNumbers = numbers.stream().filter(o -> o % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        List<Integer> oddNumbers = numbers.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNumbers);
        /////////////////////////////////////////////////////////////////////////////////
        List<Integer> numberList = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
        Predicate<Integer> even = number -> number % 2 == 0;
        numberList.stream().filter(even.negate()).forEach(System.out::println);

    }
}
