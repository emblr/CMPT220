/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/
import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loan amount (principal): ");
        double loan = sc.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double InterestRate = sc.nextDouble();

        System.out.println("Enter the loan term (in years): ");
        int loanTerm = sc.nextInt();

        System.out.printf("Your monthly mortgage payment is: $" + Mortgage(loan, InterestRate, loanTerm));
        sc.close();
    }

    public static double Mortgage(double principal, double annualRate, int years) {
        
        double monthlyRate = (annualRate / 100) / 12;
        int totalPayments = years * 12;

        // Mortgage payment formula
        double monthlyPayment = (principal * monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) / (Math.pow(1 + monthlyRate, totalPayments) - 1);

        return monthlyPayment;
    }
}

