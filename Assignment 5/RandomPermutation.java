import java.util.ArrayList;
import java.util.Random;

/**
 * @author David Hartley CS 143 Programming Assignment 5
 */
public class RandomPermutation<T> {

    /** Method shuffled the parameter arraylist randomly and returns the randomized arrayList
     *
     * @param argList The arrayList of type T to be randomized
     * @return The randomized ArrayList of type T
     */
    public ArrayList<T> shuffle(ArrayList<T> argList){

        Random rand = new Random();
        for(int i = argList.size()-1; i >= 0; i--){//For the size of the array backwards
            //Swap the Current Iteration value with a random index
            int randIndex = rand.nextInt(argList.size() - 1);//Get a random index in the length of the Array
            if(randIndex == i) continue;//If the indexes are the same, skip iteration as nothing happens in the end
            T tempRandValue = argList.get(randIndex);//Set a Temp. value of Type T for the random index
            T tempIterationValue = argList.get(i);//Set a Temp. value of Type T for the current iterations index
            argList.remove(i);//remove the current iterations index value
            argList.add(i, tempRandValue);//Insert the random value in the iteration
            argList.remove(randIndex);//Remove the random Indexes value
            argList.add(randIndex, tempIterationValue);//Insert the Iterations value into the random index
        }
        return argList;//return the shuffled arrayList
    }
}
