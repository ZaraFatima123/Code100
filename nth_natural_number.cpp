class Solution {
  public:
    long long findNth(long long n) {
      long long res = 0, place = 1;
        while(n > 0) {
            res += (n % 9) * place;  // Get the base-9 digit and append it to the result
            n /= 9;                  // Move to the next digit in base-9
            place *= 10;             // Move to the next place value in the result
        }
        return res;
    }
};     
//Given a positive integer n. You have to find nth natural number after removing all the numbers containing the digit 9.

//Examples :

//Input: n = 8
//Output: 8
//Explanation: After removing natural numbers which contains digit 9, first 8 numbers are 1,2,3,4,5,6,7,8 and 8th number is 8.
//Input: n = 9
//Output: 10
//Explanation: After removing natural numbers which contains digit 9, first 9 numbers are 1,2,3,4,5,6,7,8,10 and 9th number is 10. 

//How the Code Works:
//Conversion to Base 9:
//The function findNth takes a number n and converts it from base 10 to base 9.
//The reason we convert it to base 9 is that numbers in base 9 range from 0 to 8, so we naturally exclude any number containing the digit 9.
//Explanation of Steps:
//The variable res stores the result.
//The loop repeatedly extracts the last digit of n in base 9 (n % 9), appends it to the result, and shifts the digits using place *= 10.
//When n becomes 0, the result (res) is the nth natural number excluding those with the digit 9.
//Example Walkthrough for n = 8:
//For n = 8:

//We convert 8 from base 10 to base 9:
//8 % 9 = 8 (this is the last digit in base 9).
//n / 9 = 0 (we are done with the conversion since n is now 0).
//The result is 8.
//Thus, the 8th natural number after excluding numbers with digit 9 is 8.

//Summary:
//We convert n from base 10 to base 9 because numbers in base 9 only have digits 0 to 8, naturally excluding any number with the digit 9.
//This gives us the nth natural number in a sequence where all numbers containing the digit 9 have been removed.
