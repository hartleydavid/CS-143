/* This class must simulate a police officer inspecting parked cars. The class's responsibilities are as follows:
   -The name and badge number
   -examine a ParkedCar object and a ParkingMeter object, and determine whether the car's time has expired
   -Issue a parking ticket (generate a ParkingTicket object)  if the car's time has expired
*/

/**
 @author David Hartley CS 143 Programming Assignment 2
        Chapter 8 Programming Challenge 8
 **/

public class PoliceOfficer {
    //Private Data Fields to store the Officers Name and Badge number
    private String name, badgeNumber;

    /** Two Arg-Constructor that sets the data fields to the specified strings
     *
     * @param name Name of the officer
     * @param badgeNumber The badge number of the officer
     */
    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    /** Public method that acts as the Officer examining a parked car and the parking meter the car is parked at
     * Does so by seeing if the duration the car is parked goes over what was purchased at the parking meter
     * @param car The ParkedCar Object to examine
     * @param meter The ParkingMeter Object to examine
     * @return True if the Car is Illegally Parked, False if the car is legally parked
     */
    public boolean examineParkedCar(ParkedCar car, ParkingMeter meter){
        //Return if the minutes parked is greater than the minutes purchased
        return car.getMinutesParked() > meter.getMinutesPurchased();
    }

    /** Public method that issues a Parking ticket for a ParkedCar Object that is illegally parked
     * Does so by returning a Parking ticket object
     * @param car The ParkedCar Object that has illegally parked
     * @param minutesOver Integer for the number of minutes over the car is parked over what was purchased
     * @return The ParkingTicket Object representing the Ticket with the Parked car, police officer and the time over
     *         the car was parked
     */
    public ParkingTicket issueParkingTicket(ParkedCar car, int minutesOver){
        return new ParkingTicket( car, this, minutesOver);
    }

    /** Copy method that creates a new PoliceOfficer Object with the same data fields as this object
     *
     * @return A new copy of this Police officer Object
     */
    public PoliceOfficer copy(){
        return new PoliceOfficer(name,badgeNumber);
    }

    /** toString method that changes the printout of this object
     *
     * @return A new reformatted String for the Object
     */
    @Override
    public String toString() {
        return "Officer Identification:"
                + "\nName: " + name
                + "\nBadge Number: " + badgeNumber;
    }
}
