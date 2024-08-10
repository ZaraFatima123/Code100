//  6# Write a Java program to implement linear search
import java.util.*;
public class New_linear_search {
    public static void main(String[] args) {
        int search;

        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];

        System.out.println("Enter the 5 elements of array: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the value to find: ");
        search = sc.nextInt();

        boolean elementFound = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == search) {
                System.out.println("Element " + A[i] + " has been found at index " + i);
                elementFound = true;
                break;
            }
        }

        if (!elementFound) {
            System.out.println("Element not found");
        }
    }
}


   

    


