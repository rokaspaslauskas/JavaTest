import java.util.*;  
public class test {    
    public static void main(String args[]){       
        int amount;  
        float balance;  
        //Insert amount and balance from console  
        Scanner input = new Scanner (System.in);  
        System.out.print("Enter the amount: ");  
        amount = input.nextInt();  
        System.out.print("Enter the Total Balance: ");  
        balance = input.nextFloat();  
        //Reduce amount+fee from balance  
        balance = balance-(amount + 0.50);  
        //Print new balance  
        System.out.print("New Balance is: "+balance);  
      input.close();  
    }    
}  