// 5# Write a Java program and compute the sum of the digits of an integer.

  import java.util.*;
 public class Sum_of_digits{
    public static void main(String[] args) {
        int m,n=0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        m = sc.nextInt();

        while(m>0){
            n = m%10;
            sum = sum + n;
            m = m/10;

            
        }
        System.out.println("Sum of digits is: " + sum);
        
    }
}