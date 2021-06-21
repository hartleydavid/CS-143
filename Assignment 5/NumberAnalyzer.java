import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author David Hartley CS 143 Programming Assignment 5
 */
public class NumberAnalyzer <T extends Number & Comparable<T>> {
    //Private Data-Field that holds the Array of Type T
    private ArrayList<T> list;

    // No argument Constructor that instantiates the ArrayList data field
    public NumberAnalyzer(){
        list = new ArrayList<>();
    }

    /**One Argument Constructor that copies parameters ArrayList into this objects data-field
     *
     * @param args The Argument Array to set this object to have
     */
    public NumberAnalyzer(ArrayList<T> args){
        list = new ArrayList<>();
        for (T arg : args) {
            list.add(arg);
        }
    }

    /** Single Argument Constructor that accepts an Array of Type T as an argument and copies the array into the
     * private data field
     * @param args Array of Type T
     */
    public NumberAnalyzer(T[] args){
        list = new ArrayList<>(Arrays.asList(args));
    }

    /** Method searches the ArrayList of this Object and finds the highest value
     *
     * @return The highest value Object of Type T in the arraylist
     */
    public T highestValue(){
        testIfArrayIsEmpty();//Test if the array is empty, throws exception if array is empty
        T highestVal = list.get(0);//The highest will temporarily be the first index
        for(int i = 1; i < list.size(); i++){//for the rest of the indexes
            //Compare the highest element to this iteration. The higher value will be the highest value
            if(list.get(i).compareTo(highestVal) > 0) highestVal = list.get(i);
        }
        return highestVal;//return the highest value
    }

    /** Method searches the ArrayList of this Object and finds the lowest value
     *
     * @return The lowest value Object of Type T in the arraylist
     */
    public T lowestValue(){
        testIfArrayIsEmpty();//Test if the array is empty, throws exception if array is empty
        T lowestVal = list.get(0);//First element in array will be the lowest value
        for(int i = 1; i < list.size(); i++){//For the rest of the array
            //Compare the lowest element to this iteration. The lowest value will be the lowest value
            if(list.get(i).compareTo(lowestVal) < 0) lowestVal = list.get(i);
        }
        return lowestVal;//return the lowest element
    }

    /** Method calculates the sum of all the elements in the array
     * Does so by converting the Type T into a Double and keep a running total with the .doubleValue() method for
     * each index.
     *
     * @return The total value cast back to Type T
     */
    public T totalValue(){
        testIfArrayIsEmpty();//Test if the array is empty, throws exception if array is empty
        //Create Wrapper Class double so that Type T may be instantiated to it
        Double total = 0.0;
        for(T t : list){//For each element in the array
            //Keep the running total of double values to
            total += t.doubleValue();
        }
        return (T) total;
    }

    /** Method returns the average of all values in the arrayList
     * Does so by calculating the total and dividing by the .size() of the array
     * @return The Double value for the average of all elements
     */
    public double averageOfValues(){
        testIfArrayIsEmpty();//Test if the array is empty, throws exception if array is empty
        return totalValue().doubleValue() / list.size();
    }

    /** Method provides code-reuse for the if() statement in the method. Tests if the arrayList in the data field is
     * empty. If so, throw an exception stating the arrayList provided was empty.
     */
    private void testIfArrayIsEmpty(){
        if(list.isEmpty()) throw new IllegalArgumentException("ArrayList provided is empty.");
    }
}
