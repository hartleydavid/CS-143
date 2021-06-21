import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author David Hartley CS143 Programming Assignment #6
 * Challenge 3
 */
public class EmployeeMap {
    //Private Data Field for the Map with a Key of String and value of Employee
    private Map<String, Employee> employeeMap;

    //No Argument Constructor that instantiates the HashMap Collection
    public EmployeeMap() {
        employeeMap = new HashMap<>();
    }

    /**
     * Single Argument Constructor that copies the contents of another Map with key of string and value of ID
     * and copies it to this object
     *
     * @param employeeMap A map of Key string value Employee that has already been instantiated and filled
     */
    public EmployeeMap(Map<String, Employee> employeeMap) {
        this();//Call no arg constructor to instantiate the map
        Set<String> keySet = employeeMap.keySet();//get the keySet of the map
        for (String s : keySet) {//for each key in the map
            this.employeeMap.put(s, employeeMap.get(s).copy());//add the key and copy of value into the this map
        }
    }

    /**
     * Method adds an employee object to the Employee Map
     *
     * @param employee The employee object to add
     */
    public void add(Employee employee) {
        employeeMap.put(employee.getID(), employee);
    }

    /**
     * Getter method that takes an Employees ID and attempts to get an employee with the same ID
     *
     * @param employeeID The ID number to search for
     * @return The employee object if the ID's match up, null if the ID does not exists
     */
    public Employee get(String employeeID) {
        //If the ID does not exist in the map
        if (!employeeMap.containsKey(employeeID)) {
            //Print out a message and return null
            System.out.println("**Employee was not found, nothing was copied**");
            return null;
        }
        //Return the match Employee object
        return employeeMap.get(employeeID).copy();
    }

    /**
     * Remove method that will remove a given employee object if it is in the collection by the Employees ID
     *
     * @param employeeID The employee ID to use to remove the employee object from the map
     */
    public void remove(String employeeID) {
        //If the Map is empty or does not contain the Employee
        if (employeeMap.isEmpty() || !employeeMap.containsKey(employeeID)) {
            //Print out message
            System.out.printf("Employee under ID-%s was not found.\n", employeeID);
            return;//exit code

        }
        employeeMap.remove(employeeID);//remove the employee
    }

    /**
     * Method returns boolean value whether this objects map contains the specified employee object
     *
     * @param employee The Employee object searching for
     * @return True if the map contains the employee, false if it was not found
     */
    public boolean contains(Employee employee) {
        //If the ID is in the collection
        return employeeMap.containsKey(employee.getID())
                //If the name of Employee under the ID matches the Employee searching for
                && employeeMap.get(employee.getID()).getName().equals(employee.getName());
    }

    /**
     * Method returns boolean value whether this objects map contains the specified employee ID
     *
     * @param employeeID The Employee ID searching for
     * @return True if the map contains the employee, false if it was not found
     */
    public boolean contains(String employeeID) {
        return employeeMap.containsKey(employeeID);
    }

    /**
     * toString method that returns a string with all the employees data listed out
     *
     * @return A string with all the employee data from the map
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();//Create a stringBuilder object
        Set<String> keySet = employeeMap.keySet();//Get the Key set of the map
        stringBuilder.append("[ ");//Append opening bracket
        for (String s : keySet) {//for each key in the maps
            stringBuilder.append(employeeMap.get(s)).append(" ");//Append the value with the key
        }
        stringBuilder.append("]");//append the closing bracket

        return stringBuilder.toString();//return the string
    }
}
