package Wednesday;

import java.util.Scanner;

public class GradingExample {

    public static void main(String[] args) {

        //create the scanner so that I can read what's in the console and eventually type in it
        Scanner scannerGrade = new Scanner(System.in);

        //A prompt that tells the user to input their grade percentage
        System.out.println("Please type your percentage grade here: ");

        //Assign the input in the console to an int variable named "grade" using the scanner.nextInt() method
        int grade = scannerGrade.nextInt();

        //Now we need to test the value of the grade variable against the thresholds for different grades
        if(grade >= 90) {
            System.out.println("Grade: A");
        }
        else if(grade >= 80) {
            System.out.println("Grade: B");
        }
        else if(grade >= 70) {
            System.out.println("Grade: C");
        }
        else if(grade >= 65) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }



    }
}
