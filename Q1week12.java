//1# Create an interface Account having methods- deposit(), withdraw() and 
// aboutBank() (abountBank() is a static method). Create two classes Saving
// and Current which implement the Account interface. Call the methods of 
// Saving and Current classes in main method
import java.util.*;
class ccccc{
    int balance;

public ccccc(int balance){
    this.balance = 0;

}
}
interface Account{
    
    public void Deposit(int amount);
    public void Withraw(int amount);
    static void aboutBank(){
        System.out.println("This is a big bank");
    }
    }

class Savings implements Account{
    public int balance;

    public Savings(int balance){
        this.balance = balance;
    }
    public void Deposit(int amount1){
         if(amount1>0){
            balance += amount1;
           
            System.out.println("Deposited $: " + amount1 +"the new balance is: " + balance);
        }
        else{
            System.out.println("Invalid deposit amount!!");
        }
       }
        public void Withraw(int amount2){
            if(amount2>0 && amount2 <=balance){
            balance -= amount2;
            System.out.println("Withraw $: " +" " + amount2 + "Current balance after withdrawing:  " + balance);
        }
        else{
            System.out.println("Invalid deposit amount!!");
        }
        
    }

    }
class Current implements Account{
    private int balance;

    public Current(int balance){
        this.balance = balance;
    }
     public void Deposit(int amount3){
         if(amount3>0){
            balance += amount3;
           
            System.out.println("Deposited $: " +" "+ amount3 + "\n " +"the new balance is:" + balance);
        }
        else{
            System.out.println("Invalid deposit amount!!");
        }
       }

        public void Withraw(int amount4){
            if(amount4>0 && amount4<=balance){
            balance -= amount4;
            System.out.println("Withraw $: " + amount4 +"\n " + "Current balance after withdrawing: " + balance);
        }
        else{
            System.out.println("Invalid deposit amount!!");
        }
        
    }



}
   
   

public class Q1week12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount to deposit in Savings account: ");
        int amount1 = sc.nextInt();
        System.out.println("Enter the amount to withraw in Savings account: ");
        int amount2 = sc.nextInt();

        System.out.println("Enter the amount to deposit in Current account: ");
        int amount3 = sc.nextInt();
        System.out.println("Enter the amount to withraw in Current account: ");
        int amount4 = sc.nextInt();
        Account a = new Savings(10000);

        a.Deposit(amount1);
        a.Withraw(amount2);
        Account.aboutBank();
        
        Account ac = new Current(20000);
        ac.Deposit(amount3);
        ac.Withraw(amount4);
    }
}