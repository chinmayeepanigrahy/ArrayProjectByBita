package arrays;

import java.util.Scanner;

public class ArrayStrg {

    static Scanner sc = new Scanner(System.in);
    static String[] names;

    public static void main(String[] args) {
        createStringArray();
        fillStringArray();
        printStringArray();

    }

    public static void createStringArray() {
        System.out.println("how many names do you want");
        int length;
        length = sc.nextInt();
        sc.nextLine();
        names = new String[length];

    }

    public static void fillStringArray() {
        for (int i = 0; i < names.length; i++) {

            System.out.println("what values do u want at position :"+ i);
            String s = sc.nextLine();
//            names[i] = sc.nextLine();
            names[i] = s;

        }
    }
    
    public static void printStringArray()
    {
        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]);
            
        }
    }

}

