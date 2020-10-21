package arrays;

import java.util.Scanner;

public class Arrays {

    static Scanner sc = new Scanner(System.in);
    static int[] numbers;

    public static void main(String[] args) {
        createArray();
        fillArray();
        printArray();

    }

    public static void createArray() {
        System.out.println("how many numbers do you want");
        int sizeOfArray = sc.nextInt();
        sc.nextLine();
       
        numbers = new int[sizeOfArray];
    }

    public static void fillArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("what number do you want at position " + i + ":");
            int numbertoAdd = sc.nextInt();
            numbers[i] = numbertoAdd;

//numbers [i] = sc.nextInt();
        }

    }

    public static void printArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
