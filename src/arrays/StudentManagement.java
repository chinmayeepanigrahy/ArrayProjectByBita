
package arrays;

import java.util.Scanner;


public class StudentManagement {
    
    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[27];
    static int nextFreePosition = 0;
    
    public static void addStudent()
    {
        System.out.println("who:");
        String value = sc.nextLine();
        names[nextFreePosition]=value;
       
        nextFreePosition = nextFreePosition +1;
        
    }
    public static void main(String[] args) {
        addStudent();    }
    
}
