//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bizarre Quiz!!! This is a quiz about random stuff.");
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        
        
        System.out.println("Hey " + name + ". The quiz will consist of 3 question worth 1 point each. Try to reach 3/3. Here we go!");

        Integer totalPoints = 0; //counter for points
        System.out.println("");//make the quiz more readable
        System.out.println("First Question: What's 9 + 10?(Type the option number for your answer)");
        System.out.println("1. 19");
        System.out.println("2. 21");
        System.out.println("3. 910");
        System.out.println("4. I don't know math");

        System.out.print("My choice is number: ");
        Integer ans1 = sc.nextInt();
        
        if (ans1 == 1){
            System.out.println("You get one point for solving it mathematically.");
            totalPoints += 1;
        }else if (ans1 == 2){
            System.out.println("Wrong but you still get one point for the reference!");
            totalPoints += 1;
        }else{
            System.out.println("Better luck next time. No points.");
        }
        
        System.out.println("");
        
        System.out.println("Second Question: Fill in the blank from a song made by Travis Scott");
        System.out.println("Im the _______ in the room");
        
        System.out.print("My answer is: ");
        sc.nextLine(); //gets rid of the issue of the next scanner not being able to get user input      
        String ans2 = sc.nextLine();
        String Lowerans2 = ans2.toLowerCase();//makes sure if the user types a letter in cap to switch to lower
        
        if(Lowerans2.equals("highest")){
            System.out.println("Correct! You get one point!");
            totalPoints += 1;
        }else{
            System.out.println("Wrong. It was highest. Better luck next time :(");
        }
        System.out.println("");
        
        System.out.println("Now time for the last question. Here we go.");

        System.out.println("What year was the Declaration of Independence signed?(just type the year)");
        System.out.print("It was signed on: ");
        
        
        Integer year = sc.nextInt();
        

        if (year == 1776) {
            System.out.println("Correct!! You get one point!");
            totalPoints += 1;
        }else{
            System.out.println("Sorry. Tough luck.");
        }

        System.out.println("");

        System.out.println("That's a wrap on the quiz. Let's see how you did.");

        if (totalPoints == 3) {
            System.out.println("WOW a 3/3. Fantastic!!!");
        }else if (totalPoints == 2) {
            System.out.println("Your score is 2/3. Not bad kid!");
        }else if (totalPoints == 1) {
            System.out.println("A 1/3. Nothing much to say but better luck next time.");
        }else{
            System.out.println("...");
            System.out.println("A 0/3. Uh you might want to try again.");
        }

        
    }
}


