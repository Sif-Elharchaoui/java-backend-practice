package week1.day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Student Tracker
 *
 * A console-based student management application.
 * Supports CRUD operations, searching, sorting,
 * and basic student statistics.
 *
 * Built as a Week 1 Java project using:
 * ArrayList, methods, loops, conditions, and Scanner.
 */
public class StudentTracker {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            printMenu();

            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("\n--- Add Student ---");

                    System.out.print("Enter student name: ");
                    String name = sc.next();

                    if (findStudentIndex(names, name) != -1) {
                        System.out.println(
                                "✗ A student with this name already exists."
                        );
                        break;
                    }

                    int grade = readValidGrade(sc);

                    addStudent(names, grades, name, grade);
                }

                case 2 -> {
                    System.out.println("\n--- All Students ---");

                    displayAllStudents(names, grades);
                }

                case 3 -> {
                    System.out.println("\n--- Search Student ---");

                    System.out.print("Enter student name: ");
                    String targetName = sc.next();

                    int index = findStudentIndex(names, targetName);

                    if (index == -1) {
                        System.out.println("✗ Student not found.");
                    } else {
                        System.out.println("✓ Student found.");
                        System.out.println("Name  : " + names.get(index));
                        System.out.println("Grade : " + grades.get(index));
                    }
                }

                case 4 -> {
                    System.out.println("\n--- Update Grade ---");

                    System.out.print("Enter student name: ");
                    String targetName = sc.next();

                    int newGrade = readValidGrade(sc);

                    boolean updated = updateStudent(
                            names,
                            grades,
                            targetName,
                            newGrade
                    );

                    if (updated) {
                        System.out.println(
                                "✓ Grade updated successfully."
                        );
                    } else {
                        System.out.println("✗ Student not found.");
                    }
                }

                case 5 -> {
                    System.out.println("\n--- Delete Student ---");

                    System.out.print("Enter student name: ");
                    String targetName = sc.next();

                    boolean deleted = deleteStudent(
                            names,
                            grades,
                            targetName
                    );

                    if (deleted) {
                        System.out.println(
                                "✓ Student deleted successfully."
                        );
                    } else {
                        System.out.println("✗ Student not found.");
                    }
                }

                case 6 -> {
                    System.out.println("\n--- Sort Students ---");

                    sortByGrade(names, grades);

                    System.out.println(
                            "✓ Students sorted from highest to lowest grade."
                    );
                }

                case 7 -> {
                    System.out.println("\n--- Student Statistics ---");

                    displayStatistics(names, grades);
                }

                case 0 -> {
                    System.out.println();
                    System.out.println(
                            "Thank you for using Student Tracker."
                    );
                    System.out.println("Goodbye!");
                }

                default -> {
                    System.out.println("\n✗ Invalid option.");
                    System.out.println(
                            "Please choose a number from 0 to 7."
                    );
                }
            }

        } while (choice != 0);

        sc.close();
    }

    // Displays the main menu.
    public static void printMenu() {

        System.out.println();
        System.out.println("======================================");
        System.out.println("          STUDENT TRACKER");
        System.out.println("======================================");
        System.out.println("  1. Add Student");
        System.out.println("  2. Display Students");
        System.out.println("  3. Search Student");
        System.out.println("  4. Update Grade");
        System.out.println("  5. Delete Student");
        System.out.println("  6. Sort by Grade");
        System.out.println("  7. Student Statistics");
        System.out.println("  0. Exit");
        System.out.println("======================================");
    }

    // Adds a new student.
    public static void addStudent(
            ArrayList<String> names,
            ArrayList<Integer> grades,
            String name,
            int grade
    ) {

        names.add(name);
        grades.add(grade);

        System.out.println("✓ Student added successfully.");
    }

    // Displays all students in a simple table.
    public static void displayAllStudents(
            ArrayList<String> names,
            ArrayList<Integer> grades
    ) {

        if (names.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.printf("%-20s %5s%n", "Name", "Grade");
        System.out.println("----------------------------");

        for (int i = 0; i < names.size(); i++) {

            System.out.printf(
                    "%-20s %5d%n",
                    names.get(i),
                    grades.get(i)
            );
        }
    }

    // Finds a student and returns their index.
    public static int findStudentIndex(
            ArrayList<String> names,
            String targetName
    ) {

        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).equals(targetName)) {
                return i;
            }
        }

        return -1;
    }

    // Updates a student's grade.
    public static boolean updateStudent(
            ArrayList<String> names,
            ArrayList<Integer> grades,
            String targetName,
            int newGrade
    ) {

        int index = findStudentIndex(names, targetName);

        if (index == -1) {
            return false;
        }

        grades.set(index, newGrade);

        return true;
    }

    // Deletes a student from both lists.
    public static boolean deleteStudent(
            ArrayList<String> names,
            ArrayList<Integer> grades,
            String targetName
    ) {

        int index = findStudentIndex(names, targetName);

        if (index == -1) {
            return false;
        }

        names.remove(index);
        grades.remove(index);

        return true;
    }

    // Sorts students from highest grade to lowest.
    public static void sortByGrade(
            ArrayList<String> names,
            ArrayList<Integer> grades
    ) {

        for (int i = 0; i < grades.size(); i++) {

            for (int j = i + 1; j < grades.size(); j++) {

                if (grades.get(i) < grades.get(j)) {

                    // Keep the name and grade together.
                    String tempName = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j, tempName);

                    int tempGrade = grades.get(i);
                    grades.set(i, grades.get(j));
                    grades.set(j, tempGrade);
                }
            }
        }
    }

    // Returns the number of students.
    public static int getTotalStudents(
            ArrayList<String> names
    ) {

        return names.size();
    }

    // Finds the highest grade.
    public static int getHighestGrade(
            ArrayList<Integer> grades
    ) {

        if (grades.isEmpty()) {
            return 0;
        }

        int highest = grades.get(0);

        for (int i = 1; i < grades.size(); i++) {

            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }
        }

        return highest;
    }

    // Finds the lowest grade.
    public static int getLowestGrade(
            ArrayList<Integer> grades
    ) {

        if (grades.isEmpty()) {
            return 0;
        }

        int lowest = grades.get(0);

        for (int i = 1; i < grades.size(); i++) {

            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }

        return lowest;
    }

    // Calculates the average grade.
    public static double getAverageGrade(
            ArrayList<Integer> grades
    ) {

        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    // Displays all student statistics.
    public static void displayStatistics(
            ArrayList<String> names,
            ArrayList<Integer> grades
    ) {

        if (names.isEmpty()) {
            System.out.println("No student data available.");
            return;
        }

        int totalStudents = getTotalStudents(names);
        int highestGrade = getHighestGrade(grades);
        int lowestGrade = getLowestGrade(grades);
        double averageGrade = getAverageGrade(grades);

        System.out.println("======================================");
        System.out.println("        STUDENT STATISTICS");
        System.out.println("======================================");

        System.out.println("Total Students : " + totalStudents);
        System.out.println("Highest Grade  : " + highestGrade);
        System.out.println("Lowest Grade   : " + lowestGrade);
        System.out.printf("Average Grade  : %.2f%n", averageGrade);

        System.out.println("======================================");
    }

    // Keeps asking until the user enters a valid grade.
    public static int readValidGrade(Scanner sc) {

        int grade;

        do {
            System.out.print("Enter student grade (0-100): ");
            grade = sc.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println(
                        "✗ Invalid grade. Please enter 0-100."
                );
            }

        } while (grade < 0 || grade > 100);

        return grade;
    }
}