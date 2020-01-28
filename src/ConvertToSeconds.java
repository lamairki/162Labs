import java.util.Scanner;
/**
 * This class will take in a number of user inputs and convert their time inputs to seconds
 *
 * @author Kirk LaMaire
 * @version 13 January 2020
 */


public class ConvertToSeconds
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int userHours, userMins, userSecs;

        System.out.print("Enter hours: ");
        userHours = userInput.nextInt();
        System.out.print("Enter minutes: ");
        userMins = userInput.nextInt();
        System.out.print("Enter seconds: ");
        userSecs = userInput.nextInt();
        System.out.println("This is equivalent to " + ((userHours * 60 * 60)+(userMins * 60)+userSecs) + " seconds.");
    }
}