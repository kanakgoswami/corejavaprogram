package sort.java.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AgeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));
        /////////////////////////////////////////////////////////////////
        Collections.sort(employees, Comparator.comparing(Employee::getAge)
                .thenComparingInt(Employee::getAge));
        for (Employee iterable_element : employees) {
            System.out.println(iterable_element.getAge());
        }
        ///////////////////////////////////////////////////////////////////////////////////
        List<Employee> employeesSortedList1 = employees.stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeesSortedList1);

        List<Employee> employeesSortedList2 = employees.stream().filter(o1 -> o1.getAge() < 30)
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println("employeesSortedList2" + employeesSortedList2);

    }

}
