//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //I've already set up a scanner with the name 'sc' for you!
        Scanner sc = new Scanner(System.in);

        //here's a good working example for you to reference!
        //first: we ask our user for our prompt
        System.out.println("What is your name? ");
        //second: we create a string variable and store the user input back to it
        String name = sc.nextLine();
        //third: we print it back out!
        System.out.println("Hello, " + name + "! ");


        //finish this one for me by receiving and printing the user's age back to them
        System.out.println("How old are you? ");

        Integer age = sc.nextInt();

        System.out.println(name + ", you are " + age + " years old.");


        //can you do some math for me? take these variable and print out the sum of them!
        Integer num1 = 10;
        Integer num2 = 37;
        //?

        Integer sum = num1 + num2;
        

        System.out.println("The sum of " + num1 + " plus " + num2+ " is " + sum + ".");
        
        
        

    }
}


