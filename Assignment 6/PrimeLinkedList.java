import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author David Hartley CS143 Programming Assignment #6
 * Challenge 5
 */
public class PrimeLinkedList {
    //Private Data-Field with a Java LinkedList, only way it would allow me to instantiate a iterator
    private LinkedList<Integer> linkedList;

    /**
     * No Arg Constructor
     * Instantiates LinkedList and fills it with prime numbers
     */
    public PrimeLinkedList() {
        linkedList = new LinkedList<>();
        calculatePrimeNumbers();
    }

    //Private method that calculates the first 50 prime numbers and adds them to the linked list
    private void calculatePrimeNumbers() {
        int primeNumberCounter = 0; //The number of prime numbers that have been calculated
        int currentNumber = 2;//The current number at in finding prime ones
        //While we have not calculated the first 50 prime numbers
        while (primeNumberCounter < 50) {
            int divisibleCounter = 0;//Counter for how many times the current number is equally divisible by a number
            //For the current number at going backwards by one until 1
            for (int divTest = currentNumber; divTest >= 1; divTest--) {
                //If the current number divisible by the decrementing number, increment divisible counter
                if (currentNumber % divTest == 0) divisibleCounter++;
            }
            //If only divisible by itself and 1 (Divisible equally twice)
            if (divisibleCounter == 2) {
                //Add to linkedList and increment the prime number counter
                linkedList.add(currentNumber);
                //add(currentPrimeNumber);
                primeNumberCounter++;//Increment the prime number counter
            }
            currentNumber++;//Increment the current number at and restart prime number testing
        }
    }

    /**
     * toString method that returns a string with each value in the linkedList using an iterator
     * There are 10 node values per line in the string
     *
     * @return String with all linkedList elements
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();//Create String builder object
        int lineLimit = 0;//Int variable that keeps count of how many elements are on a given line
        Iterator<Integer> iterator = linkedList.iterator();//Iterator to iterate through the LinkedList
        str.append("[ ");//Append opening bracket
        while (iterator.hasNext()) {//While there is another node
            if (lineLimit == 10) {//if there are 10 values on one line
                str.append("\n");//Start a new line
                lineLimit = 0;//Restart counter
            }
            //Append the next value to the string
            str.append(iterator.next()).append(" ");
            lineLimit++;//increment line limit
        }
        str.append("]");//Append closing bracket
        return str.toString();//return string of LinkedList
    }
}
