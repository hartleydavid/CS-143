/* This class simulates a parking ticket. Users of the class must be able to determine:
  -The make, model, color and license number of the parked car
  -The amount of the fine,
  -The name and badge number of the police officer issuing the ticket
*/

/**
 @author David Hartley CS 143 Programming Assignment 2
        Chapter 8 Programming Challenge 8
 **/

public class ParkingTicket {
    //Private Object Data-Fields to hold onto the ParkedCar objects contents and Officers Information
    private ParkedCar illegallyParkedCar;
    private PoliceOfficer issuingOfficer;
    //Private Integer Data Fields for the fine amount and how many minutes over the car was
    private int fine, minutesOver;

    /** Three- Argument Constructor that sets the Data-Fields Objects/Variables from the parameters
     * Calculates the total of the fine from the amount of time over
     * @param illegallyParkedCar The ParkedCar object for the parking ticket
     * @param issuingOfficer The Officer Issuing the Parking Ticket
     * @param minutesOver The amount of time that the car was parked over the meters time
     */
    public ParkingTicket(ParkedCar illegallyParkedCar, PoliceOfficer issuingOfficer, int minutesOver) {
        this.illegallyParkedCar = illegallyParkedCar.copy();
        this.issuingOfficer = issuingOfficer.copy();
        this.minutesOver = minutesOver;
        this.fine = parkingTicketFine(minutesOver);
    }

    /** Private Method that calculates the fine for the parking ticket
     * The amount of the fine is $25 for the first hour and more $10 for every hour afterwards
     * @param minutesOver The time that the car was parked for after the amount the meter says
     * @return The Fine amount for the parking ticket
     */
    private int parkingTicketFine(int minutesOver){
        int parkingFee = 25;//Integer Variable starting at the base $25 fine amount
        if(minutesOver <=60) return parkingFee;//if the minutes over is an hour or less, exit code with base fine
        else minutesOver -= 60;//if there are more hours, subtract the hour with the $25 fine
        //if there is a part of an hour that would not be accounted for in the final calculation
        if(minutesOver % 60 != 0) parkingFee += 10;
        //$25 base fine plus $10 per every hour over
        return parkingFee + (minutesOver/60) * 10;
    }

    /** Getter for the Parked Car object
     *
     * @return A copy of the Parked car data field
     */
    public ParkedCar getIllegallyParkedCar() {
        return illegallyParkedCar.copy();
    }

    /** Setter for the Parked car data field.
     *  Sets the data field to a copy of the new illegally ParkedCar
     * @param illegallyParkedCar The new parked car to be put on the ticket
     */
    public void setIllegallyParkedCar(ParkedCar illegallyParkedCar) {
        this.illegallyParkedCar = illegallyParkedCar.copy();
    }

    /** Getter for the Police officer object
     *
     * @return A copy of the police officer data field
     */
    public PoliceOfficer getIssuingOfficer() {
        return issuingOfficer.copy();
    }

    /** Setter for the Police Officer data field.
     *  Sets the data field to a copy of the new Police officer
     * @param issuingOfficer The new police officer to be put on the ticket
     */
    public void setIssuingOfficer(PoliceOfficer issuingOfficer) {
        this.issuingOfficer = issuingOfficer.copy();
    }

    /** Getter for the Fine data-field
     *
     * @return The fine amount for the parking ticket
     */
    public int getFine() {
        return fine;
    }

    /** Setter for the fine Data field
     *
     * @param fine The new fine amount to set the fine to for the parking ticket
     */
    public void setFine(int fine) {
        this.fine = fine;
    }

    /** Getter for the minutes over variable
     *
     * @return The minutes over data field
     */
    public int getMinutesOver() {
        return minutesOver;
    }

    /** Setter for the minutes over data field
     *
     * @param minutesOver The minutesOver data-field
     */
    public void setMinutesOver(int minutesOver) {
        this.minutesOver = minutesOver;
    }

    /** Method that Copies the Data Fields of this object to a new ParkingTicket object
     *
     * @return A copy of this ParkingTicket Object
     */
    public ParkingTicket copy(){
        return new ParkingTicket(illegallyParkedCar,  issuingOfficer, minutesOver);
    }

    /** Overridden toString method that formats the Data Fields to a readable chart
     *
     * @return A new reformatted String for the Object
     */
    @Override
    public String toString(){
        return "Parking Ticket Breakdown"
                + "\n------------------------"
                + "\nMinutes Illegally Parked: " + minutesOver
                + "\nFine Amount: $" + fine
                + "\n" + illegallyParkedCar
                + "\n" + issuingOfficer
                + "\n------------------------";
    }

}
