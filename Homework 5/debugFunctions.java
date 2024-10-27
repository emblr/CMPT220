/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static int Factorial(int X){
        Integer product = 1;
        for(int i = 1; i <= X; i++){
            product *= i;
        }
        return product;

    }
    public static int EveryOtherSum(int num){
        Integer sum = 0;
        for (int i = 1; i <= num; i += 2){
            sum += i;
        }
        return sum;
    }
    public static String Reverse(String word){
        String reverse = "";
        Integer Lenword = word.length();
        while(Lenword > 0){
            reverse += word.charAt(Lenword - 1);
            Lenword -= 1;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get its factorial: ");
        Integer factNum = sc.nextInt();
        System.out.println("The factorial of " + factNum + " is " + Factorial(factNum));

        System.out.print("Enter a number and I will tell you the sum of every other number: ");
        Integer OddNum = sc.nextInt();
        System.out.println("The sum of every other number is " + EveryOtherSum(OddNum));

        System.out.print("Enter a word so it can be reversed: ");
        sc.nextLine();
        String RevWrd = sc.nextLine();
        System.out.println(RevWrd + " reversed is " + Reverse(RevWrd));

        sc.close();
    }


}
