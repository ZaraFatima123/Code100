//  2# Write a Java program to calculate a Factorial of a number.
import java.util.*;
 public class Factorial_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            fact = fact*i;
            
        }
        System.out.println("Factorial is " + fact);
    }
    
}

    

