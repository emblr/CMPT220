/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */
import java.util.*;
public class student{
    int id;
    String name;
    String year;
    double gpa;
    //int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    public static int RanNum(){
        Random random = new Random();
        int randInt = random.nextInt(100,110);
        return randInt;
    }
    
    //new method
    void HonorRoll(){
        if(this.gpa > 3.6){
            System.out.println(this.name + " is an honor roll student.");
        }else{
            System.out.println(this.name + " is not an honor roll student.");
        }
    }

    
    //new method
    void FreeLunch(){
        if(this.id == RanNum()){
            System.out.println("Congrats kid. You get to eat today for free!");

        }else{
            System.out.println("Poor you. You don't get free lunch.");
        }
    }

}
