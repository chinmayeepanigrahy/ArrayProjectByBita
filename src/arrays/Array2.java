package arrays;

import java.util.Scanner;

public class Array2 {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    public static int[] talen = new int[10];
    static int counter = 0;
     static int sum = 0;

    public static void main(String[] args) {

        while (loop) {
            menu();
        }
    }

    public static void menu() {
        System.out.println("1.\naddNumber to array");
        System.out.println("2.update number");
        System.out.println("3.remove number");
        System.out.println("4.read a number");
        System.out.println("5.list all numbers");
        System.out.println("6.find max");
        System.out.println("7.find min");
        System.out.println("8.calculateAverage");
        System.out.println("0.exit");
        System.out.println(" \n make a choice");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 0:
                loop = false;
                break;
            case 1:
                addNumber();
                break;
            case 2:
                updateNumber();
                break;
            case 3:
                removeNumber();
                break;
            case 4:
                readNumber();
                break;
            case 5:
                listAllNumber();
                break;
            case 6:
                max();
                break;
            case 7:
                min();
                break;

            default:
                System.out.println("wrong option");
                break;

        }

    }

    public static void addNumber() {
        System.out.println("what number do u want:");
        talen[counter] = sc.nextInt();
        counter++;
//         counter= counter + 1;
        sc.nextLine();
    }

    public static void updateNumber() {

        System.out.println("which position do u want to put new number:");

        int positionOfNumber = sc.nextInt();

        System.out.println("what  new number do u want : ");

        int newNumber = sc.nextInt();

        talen[positionOfNumber] = newNumber;

    }

    public static void listAllNumber() {
        for (int i = 0; i < counter; i++) {

            System.out.println(talen[i]);

        }
    }
        public static void readNumber()
        {
            System.out.println("at what position do you want:");
            int pos = sc.nextInt();
            System.out.println(talen[pos]);
        }
    

    public static void max() {
        int max=0;
        for (int i = 1; i >talen.length; i++) {
            if(talen[i]>talen[max])
            {
                max = i;
            }
            
        }
        

    }

    public static void min() {
        int min = 0;
        for (int i = 1; i < talen.length; i++)
        {
            if(talen[i]<talen[min])
            {
min = i;
        }
    }}

    public static void calculateAverage() {
        int average = sum / counter;
        System.out.println("Average of numbers: " + average);
        
        
        

    }
    public static void removeNumber()
    {
        System.out.println(" what is the position do you want to delete:");
        int positionOfDelete = sc.nextInt();
////        counter is the next free position and also the number of elements in the array
//        counter will become the position of delete, counter is counter minus 1
        talen[positionOfDelete]= talen[counter-1];
        talen[counter-1]=0;
        counter--;
    }
}
