import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author David Hartley CS 143 Programming Assignment 5
 */
public class HighLowElement <T extends Comparable<T>> {
    //Private Data Field that holds onto an Arraylist of type T
    private ArrayList<T> list;

    // No argument Constructor that instantiates the ArrayList data field
    public HighLowElement(){
        list = new ArrayList<>();
    }

    /** One Arg-Constructor that accepts an ArrayList<T> as an argument and copies the elements to the data field
     *
     * @param args ArrayList<T> to copy into the Data field
     */
    public HighLowElement(ArrayList<T> args){
        list = new ArrayList<>();
        for (T arg : args) {
            list.add(arg);
        }
    }

    /** Single Argument Constructor that accepts an Array of Type T as an argument and copies the array into the
     * private data field
     * @param args Array of Type T
     */
    public HighLowElement(T[] args){
        list = new ArrayList<>(Arrays.asList(args));
    }

    /** Method adds an element to the end of the arrayList Data Field
     *
     * @param arg The Type T object to add to the list
     */
    public void add(T arg){
        list.add(arg);
    }

    /** Method finds the highest value of Type T in the data field array
     *
     * @return The highest Type T value
     */
    public T highestValue(){
        //If the array is empty throw an exception
        if(list.isEmpty()) throw new IllegalArgumentException("Array Provided is empty");
        T highestVal = list.get(0);//The current highest value in the array
        for(int i = 1; i < list.size(); i++){//for the rest of the elements in the array
            //Compare the highest element to this iteration. The higher value will be the highest value
            if(list.get(i).compareTo(highestVal) > 0) highestVal = list.get(i);

        }
        return highestVal;//return the highest value
    }

    /** Method finds the lowest value of Type T in the data field array
     *
     * @return The lowest Type T value
     */
    public T lowestValue(){
        //If the array is empty throw an exception
        if(list.isEmpty()) throw new IllegalArgumentException("Array Provided is empty");
        T lowestVal = list.get(0);//First element in array will be the lowest value
        for(int i = 1; i < list.size(); i++){//For the rest of the array
            //Compare the lowest element to this iteration. The lowest value will be the lowest value
            if(list.get(i).compareTo(lowestVal) < 0) lowestVal = list.get(i);
        }
        return lowestVal;//return the lowest element
    }
}
