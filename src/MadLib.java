import java.util.Scanner;

/* Girls name
 * Noun
 * Boys name
 * noun
 * verb ending in s
 * noun
 * noun (plural)
 * animal (plural)
 * animal (plural)
 * verb
 * adjective
 * noun
 * verb
 * adjective
 */

public class MadLib {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String girlName;
        String noun1;
        String boyName;
        String noun2;
        String verbEndingS;
        String noun3;
        String nounPlural;
        String animalPlural1;
        String animalPlural2;
        String verb1;
        String adjective1;
        String noun4;
        String verb2;
        String adjective2;
        String lineOne = "In (Girl's Name): (Noun One) of Time you play (Boy's Name), a young boy who";
        String lineTwo = "has no (Noun Two).  In this adventure, he (Verb Ending in S) with his trusty";
        String lineThree = "(Noun Three) and many other (Noun Plural) from his inventory.  He travels";
        String lineFour = "through time working with (Animal Plural One) and (Animal Plural Two) to (Verb One) the";
        String lineFive = "(Adjective One) (Noun Four) and (Verb Two) (Girl's Name), the (Adjective Two) princess.";

        //The following lines ask the user for words to fill the story
        System.out.print("Enter a Girl's Name: ");
        girlName = userInput.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = userInput.nextLine();

        System.out.print("Enter a Boy's Name: ");
        boyName = userInput.nextLine();

        System.out.print("Enter a noun: ");
        noun2 = userInput.nextLine();

        System.out.print("Enter a verb ending in 's': ");
        verbEndingS = userInput.nextLine();

        System.out.print("Enter a noun: ");
        noun3 = userInput.nextLine();

        System.out.print("Enter a plural noun: ");
        nounPlural = userInput.nextLine();

        System.out.print("Enter an animal (plural): ");
        animalPlural1 = userInput.nextLine();

        System.out.print("Enter an animal (plural): ");
        animalPlural2 = userInput.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = userInput.nextLine();

        System.out.print("Enter an adjective: ");
        adjective1 = userInput.nextLine();

        System.out.print("Enter a noun: ");
        noun4 = userInput.nextLine();

        System.out.print("Enter a verb: ");
        verb2 = userInput.nextLine();

        System.out.print("Enter an adjective: ");
        adjective2 = userInput.nextLine();

        //Line 1 replacements
        lineOne = lineOne.replace("(Girl's Name)", girlName);
        lineOne = lineOne.replace("(Noun One)", noun1);
        lineOne = lineOne.replace("(Boy's Name)", boyName);

        //line 2 replacements
        lineTwo = lineTwo.replace("(Noun Two)", noun2);
        lineTwo = lineTwo.replace("(Verb Ending in S)", verbEndingS);

        //line 3 replacements
        lineThree = lineThree.replace("(Noun Three)", noun3);
        lineThree = lineThree.replace("(Noun Plural)", nounPlural);

        //line 4 replacements
        lineFour = lineFour.replace("(Animal Plural One)", animalPlural1);
        lineFour = lineFour.replace("(Animal Plural Two)", animalPlural2);
        lineFour = lineFour.replace("(Verb One)", verb1);

        //line 5 replacements
        lineFive = lineFive.replace("(Adjective One)", adjective1);
        lineFive = lineFive.replace("(Noun Four)", noun4);
        lineFive = lineFive.replace("(Verb Two)", verb2);
        lineFive = lineFive.replace("(Girl's Name)", girlName);
        lineFive = lineFive.replace("(Adjective Two)", adjective2);

        //printing the story to the serial monitor
        System.out.println(lineOne);
        System.out.println(lineTwo);
        System.out.println(lineThree);
        System.out.println(lineFour);
        System.out.println(lineFive);


    }
}
