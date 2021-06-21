//This class simulates a parked car. It has fields and methods for managing the car's make, model, color,
// license number, and the number of minutes that the car has been parked.

/**
 @author David Hartley CS 143 Programming Assignment 2
        Chapter 8 Programming Challenge 8
 **/
public class ParkedCar {
    //Private String Data-Fields for the Make, model, color, and license for the parked car
    private String make, model, color, license;
    //Private Integer Data-Field for how many minutes parked the car is currently at
    private int minutesParked;

    /** Five-Argument Constructor that sets all the data fields to their corresponding Parameter
     *
     * @param make The make of the car
     * @param model The model of the car
     * @param color The color of the car
     * @param license The license plate of the car
     * @param minutesParked The time that the car has been parked
     */
    public ParkedCar(String make, String model, String color, String license, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.license = license;
        this.minutesParked = minutesParked;
    }

    /** Copy method that copies the Data Fields in this object into another new ParkedCar Object
     *
     * @return A new ParkedCar Object with this Objects Data-Fields
     */
    public ParkedCar copy(){
        return new ParkedCar(make, model, color, license, minutesParked);
    }

    /** Getter for the make of the car
     *
     * @return The make data field
     */
    public String getMake() {
        return make;
    }

    /** Setter for the make of the car
     *
     * @param make The new make to set the cars info to
     */
    public void setMake(String make) {
        this.make = make;
    }

    /** Getter for the model of the car
     *
     * @return The model of the car
     */
    public String getModel() {
        return model;
    }

    /** Setter for the model of the car
     *
     * @param model The new model to set the car to
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** Getter for the color of the car
     *
     * @return The color of the car
     */
    public String getColor() {
        return color;
    }

    /** Setter for the color of the car
     *
     * @param color The new color to set the car to
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Getter for the license of the car
     *
     * @return The license plate of the car
     */
    public String getLicense() {
        return license;
    }

    /** Setter for the license plate of the car
     *
     * @param license The new license plate of the car
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /** Getter for the minutes the car has been parked for
     *
     * @return The minutes the car has been parked
     */
    public int getMinutesParked() {
        return minutesParked;
    }

    /** Setter for the minutes parked
     *
     * @param minutesParked The new time (int minutes) has been parked for
     */
    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    /** Overridden toString method that formats the Objects Data Fields
     *
     * @return A new reformatted String for the Object
     */
    @Override
    public String toString() {
        return "Cars Information:"
                +"\n------------------------"
                +"\nMake: " + make
                +"\nModel: " + model
                +"\nColor: " + color
                +"\nLicense Plate: " + license
                +"\nTime Parked (in minutes): " + minutesParked
                + "\n------------------------";
    }
}
