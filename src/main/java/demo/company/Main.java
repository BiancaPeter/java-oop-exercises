package demo.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Developer[] developers = new Developer[3];
        developers[0] = new Employee("Andrei", 9500);
        developers[1] = new Freelancer("Radu", 300);
        developers[2] = new Employee("Andra", 13000);

        DevDepartment devDepartment = new DevDepartment(developers);
        devDepartment.solveProductionBugs();
        showSmallestAndBiggestNumber();
    }

    static void showSmallestAndBiggestNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int size = console.nextInt();
        int[] numbers = new int[size];
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of array = ");
            numbers[i] = console.nextInt();
        }

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }

        }

        System.out.println(min + " is the smallest number.");
        System.out.println(max + " is the biggest number.");
    }
}
