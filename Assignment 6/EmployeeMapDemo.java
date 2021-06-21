/**
 * @author David Hartley CS143 Programming Assignment #6
 * Challenge 3 - Demo
 */
public class EmployeeMapDemo {
    public static void main(String[] args) {
        //Employee Objects
        Employee e1 = new Employee("David", "1028751");
        Employee e2 = new Employee("Emely", "88531369");
        Employee e3 = new Employee("Jaxon", "1122345");
        Employee e4 = new Employee("Nick", "9987654");
        Employee e5 = new Employee("Racheal", "753951");
        Employee employeeNotInMap = new Employee("John", "111111");
        //EmployeeMap Object
        EmployeeMap employeeMap = new EmployeeMap();
        //Add elements to the map
        employeeMap.add(e1);
        employeeMap.add(e2);
        employeeMap.add(e3);
        employeeMap.add(e4);
        employeeMap.add(e5);
        //Print out the original Map before removing elements
        System.out.println("Original Map Elements: " + employeeMap);
        //Employees in the collection remove
        employeeMap.remove("1028751");
        //Employees not in the collection remove
        employeeMap.remove("123456");
        //Print out Map after removing elements
        System.out.println("After remove() Map Elements: " + employeeMap);
        //Add back the employee Objects that were removed
        employeeMap.add(e4);
        employeeMap.add(e1);
        //Tests for copy() (Employees that are in the collection)
        System.out.printf("\nEmployeeMap copy() test 1 (Collection contains Employee): %s\n", employeeMap.get("1122345"));
        //Tests for copy() (Employees that are not in the collection)
        System.out.printf("EmployeeMap copy() test 2 (Collection does not contain Employee): %s\n",
                employeeMap.get("1111111111111"));
        //Tests for contains() (Employees that are in the collection)
        System.out.printf("\nContains() method for Employee in Map:\n-By Employee Object: %s\n-By Employee ID: %s",
                employeeMap.contains(e1), employeeMap.contains("1028751"));
        //Tests for contains() (Employees that are not in the collection)
        System.out.printf("\nContains() method for Employee NOT in Map:\n-By Employee Object: %s\n-By Employee ID: %s",
                employeeMap.contains(employeeNotInMap), employeeMap.contains("111111111111"));
    }
}
