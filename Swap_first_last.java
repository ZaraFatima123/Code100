//  3# Write a Java program to swap the first and last elements of an array
import java.util.*;
 public class Swap_first_last {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A[] = new int[5];
    int len = A.length;
    int temp = A[0];
    System.out.println("Enter the 5 elements of array:");

    for(int i=0;i<A.length;i++){
        A[i] = sc.nextInt();
    }
    
    System.out.println("Swapping first and last element of  array:");

    for(int i=0;i<len;i++){
        int x = A[0];
        A[0] = A[len-1];
        A[len - 1] = x;   
    }
    for(int x:A){
        System.out.print(x + " ");
    }
}
 }
