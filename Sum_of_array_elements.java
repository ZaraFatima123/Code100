// 2# Write a Java program to calculate the sum of all the array elements.
 import java.util.*;
public class Sum_of_array_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sum = 0;
        System.out.println("Enter the size of the array: ");
         int n = sc.nextInt();
         int A[] = new int[n];

         System.out.println("Enter elements of array:");
         for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
         }

         System.out.println("The sum of array elements: ");
         for(int i=0;i<n;i++){
            sum = sum + A[i];
         }
         System.out.println(sum);
    }
}
