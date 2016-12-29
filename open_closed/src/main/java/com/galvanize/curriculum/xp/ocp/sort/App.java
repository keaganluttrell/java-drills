package com.galvanize.curriculum.xp.ocp.sort;

import java.util.List;

import static java.util.Arrays.asList;

class App {

    public static void main(String... args) {

        List<Student> students;

        System.out.println("Sorted by Score (ascending)");

        students = asList(
                new Student("Bob", "Brown", 1),
                new Student("Alan", "Arnold", 9),
                new Student("Charlie", "Chaplin", 5)
        );
        BubbleSort.sort(students, SortOrder.ASC);
        students.forEach(System.out::println);

        System.out.println("Sorted by Score (descending)");
        students = asList(
                new Student("Bob", "Brown", 1),
                new Student("Alan", "Arnold", 9),
                new Student("Charlie", "Chaplin", 5)
        );
        BubbleSort.sort(students, SortOrder.DESC);
        students.forEach(System.out::println);
    }
}
