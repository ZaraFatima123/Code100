  // 4# Write a Java program to find out whether the given String is Palindrome or not
  import java.util.*;
 public class String_pallindrome_or_not {
   public static void main(String[] args) {
       
   String r = " ";
   boolean ispalin = true;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a string: ");
   String s1 = sc.nextLine();
   int len = s1.length();
   for(int i=0;i<=len/2;i++){
   if(s1.charAt(len-1-i)!=s1.charAt(i)){
      ispalin = false;
      break;
   }
}
       System.out.println(ispalin);
   


   
}
}



