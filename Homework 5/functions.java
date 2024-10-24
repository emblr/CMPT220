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
        System.out.println("Enter a year: ");
        Integer year = sc.nextInt();
        System.out.println(LeapYear(year));
    }
    public static String LeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    return ("It is a leap year");
                }
                return ("It is not a leap year");
            }
            return ("It is a leap year");
        }
        return ("It is not a leap year");

    }
}
