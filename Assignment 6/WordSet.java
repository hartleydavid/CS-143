import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author David Hartley CS143 Programming Assignment #6
 * Challenge 1
 */

public class WordSet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Create a scanner object for input
        System.out.println("Please enter a sentence of any length: ");// Print out a prompt for the user
        String userInput = input.nextLine();//Get the next line from user input
        String[] tokenizedString = userInput.split(" ");//Tokenize the string by the spaces
        SortedSet<String> mySet = new TreeSet<>();//Create a TreeSet object so it sorts objects for us
        for (String s : tokenizedString) {//Add all the words from input into the TreeSet, removing punctuation if in string
            addToSet(mySet, removeEndingPunctuation(s));
        }
        //Display all uniques elements in ascending order
        System.out.printf("All the unique elements from user input in ascending order: %s", mySet);
    }

    /**
     * Method traverses String to see if there is punctuation at the end of a word including:
     * Periods (.), Commas(,), ! and ?
     *
     * @param s The string to test
     * @return A tokenized string that does not contain punctuation if any is found.
     * The normal string if no punctuation is found at the end
     */
    private static String removeEndingPunctuation(String s) {
        //Test cases for periods commas ! and ? at the end of the string, if so remove the ending
        //If no punctuation was found return the string untouched
        return s.endsWith(".") || s.endsWith(",") || s.endsWith("!") || s.endsWith("?") ? s.substring(0, s.length() - 1) : s;
    }

    /**
     * Private method that will add an element to a String TreeSet object if it is not already in the set
     *
     * @param mySet       The set to be adding to
     * @param stringToAdd The string to be adding
     */
    private static void addToSet(SortedSet<String> mySet, String stringToAdd) {
        //If the set is empty, add the string and exit method
        if (mySet.isEmpty()) {
            mySet.add(stringToAdd);
            return;
        }
        //For all the items in the set
        for (String s : mySet) {
            //If the current item in the set equals the string to add ignoring upper/lowercase, exit code w/o adding
            if (s.equalsIgnoreCase(stringToAdd)) {
                return;
            }
        }
        //If not in the set yet, add to the set
        mySet.add(stringToAdd);
    }
}