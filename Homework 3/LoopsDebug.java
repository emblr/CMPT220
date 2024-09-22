import java.util.Scanner;


public class LoopsDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.print("Enter a number and I will tell you the fatorial: ");
        Integer x = sc.nextInt();
        Integer product = 1;
        //here's a hint
        for (int i = 1; i <= x; i++){
            product *= i;

        }
        System.out.println(product);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        Integer num = sc.nextInt();
        Integer sum = 0;
        for(Integer i = 1;i <= num;i += 2 ){
            sum += i;
        }
        System.out.println("The sum of every other number is : " + sum);


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        String reverse = "";
        System.out.print("Type in a word: ");
        sc.nextLine();
        String word = sc.nextLine();
        Integer LenWord = word.length();
        
        while(LenWord > 0){
            //System.out.println(word.charAt(LenWord - 1));
            reverse += word.charAt(LenWord - 1);
            LenWord -= 1;
            
        }

        System.out.println(reverse);
        //hint
        //String reverse = "";







        sc.close();

    }
}
