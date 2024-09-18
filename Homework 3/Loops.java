/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type in any word of your choice");
        String input = sc.nextLine();

        Integer wordLength = input.length();
    
        
        //read the problem wrong but this is for if you want to print out the strings letter one by one in reverse
        /*while(wordLength > 0){
            System.out.println(input.charAt(wordLength - 1));
            wordLength -= 1;
        }/* */
        
        for(int  i = 0; i < wordLength; i++){
            System.out.println(input.charAt(i));
        }

        sc.close();
    }
}

/*This is my explanation
i new in  python there was a way to get a strings total lenght and print a character from the string
i went on google to look up the len and character methods
like in python i gave the length of the string to a variable so i can easily access it
the condtions of my for loop has a starting value of 0 , the loop will keep going as long as its smaller than the length of the string, and the starting value will increase by 1 for each iteration
the loop prints out a letter from the string index i until i is greater than the character length
for example: if i enter my name, Mickey, it has a length of 6 but in reality its actually 0,1,2,3,4,5
that is why i start at 0 in my for loop, if i started at 1 the first letter that will print out is i not m

simple translation:
i ask the user for a string input
after receiving the input, i create a varibale that counts the lenght of the chr of the string the user typed
in a for loop, i start at 0 to print out the first letter as that is the first inde(place value)) on any chr, not 1
it will keep going until i is the lenght of the string(if not it will create an error because there is nothing to print)
 */