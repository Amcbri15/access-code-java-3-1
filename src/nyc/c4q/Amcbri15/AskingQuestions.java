package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Access Code 2.1
 * Anthony McBride
 * AskingQuestions.java
 * This class prompts the user for some personal data and then repeats it back to them.
 */
public class AskingQuestions {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int age;
        String heightFt;
        String heightIn;
        double weight;

        System.out.println("How old are you? ");
        age = keyboard.nextInt();

        System.out.println("How many feet tall are you? ");
        heightFt = keyboard.next();

        System.out.println("How many inches tall are you? ");
        heightIn = keyboard.next();

        System.out.println("How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println("So you are " + age + " old, " + heightFt + heightIn + " tall and " + weight + " heavy.");

    }
}
