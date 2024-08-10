import java.util.*;
 public class String_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name = sc.nextLine();
        String rev = "";
       
        int len = name.length();

        for(int i=len-1;i>=0;i--){
             rev = rev + name.charAt(i);
         
        }
        System.out.println("The reversed string is: " +rev);
        // if(rev==name){
        //     System.out.println("It is pallindrome string");
        // }
        // else{
        //     System.out.println("Not pallindrome");
        // }

        if(rev.equals(name)){
            System.out.println("pallindrome String");

        }
        else{
            System.out.println("Not pallindrome");
        }
    }
    
}


//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String name = sc.nextLine();
//         String rev = ""; // Change the initialization to an empty string (""), not a space (" ")

//         int len = name.length();

//         for (int i = len - 1; i >= 0; i--) {
//             rev = rev + name.charAt(i);
//         }

//         System.out.println("The reversed string is: " + rev);

//         // Use equals to check if it's a palindrome
//         if (rev.equals(name)) {
//             System.out.println("It is a palindrome string");
//         } 
//         else {
//             System.out.println("Not a palindrome");
//         }
//     }
// }


