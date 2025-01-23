/From Java utilities, we import the scanner module which will be used to accept input/
import java.util.Scanner;
public class BONUS {
    public static void main(String[] args){
        // here we are declaring a type or called scanner which will be the new name of the module
        //in the function we pass the system input
        Scanner scanner = new Scanner(System.in);
        
        double bonus;
        
        System.out.print("Enter Your Salary: ");
        int salary = scanner.nextInt();// input is assigned to the variable salary
        
        
        System.out.print("Enter The years Of Service: ");
        int years = scanner.nextInt();// input is assigned to the variable years
        
        //The bonus calculation is done using the IF statement
        if(years>10){
            bonus = 0.12 * salary;
        }
        
        else if(years>=6 && years<=10){
            bonus = 0.1 * salary;
        }
        
            
        else{
            bonus = 0.8 * salary;
        }
        
        System.out.println("Your Salary is: " + salary); //salary display
        System.out.print("Your Net Bonus Is: " + bonus); // bonus display
        
        scanner.close(); //closing of the scanner 
    }
}
