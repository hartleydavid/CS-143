//This class simulates a parking meter.  It provides fields(s) and methods that can be used to determine how much time has been purchased.

/**
 @author David Hartley CS 143 Programming Assignment 2
        Chapter 8 Programming Challenge 8
 **/
public class ParkingMeter {
    //Private Data-Fields for the payment and the minutes purchased at the Parking Meter
    private int payment, minutesPurchased;

    /** Single Argument Constructor that only takes the payment to the Parking Meter and sets the data field for it.
     *  Then calculates the hours purchased 
     * @param payment The new payment amount for the parking meter
     */
    public ParkingMeter(int payment) {
        this.payment = payment;
        this.minutesPurchased = calculateMinutesPurchased(payment);
    }

    /**
     * Setter that changes the payment amount for the parking meter, doing so also changes the hours purchased
     *
     * @param payment The new payment amount for the parking meter
     */
    public void setPayment(int payment) {
        this.payment = payment;
        this.minutesPurchased = calculateMinutesPurchased(payment);//when the payment is updated, so are the minutes
    }

    /**
     * Private method that calculates the hours that were purchased from the payment provided
     * You pay $1 per 2 hours, does not accept payment with cents.
     *
     * @param payment The payment amount the user entered into the machine
     */
    private int calculateMinutesPurchased(int payment) {
        return 120 * payment;//120 for the 2 hours per dollar and converting the hours to minutes (60 * 2)
    }

    /** Getter for the hours purchased data field
     * @return The hours purchased
     */
    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    /**Copy method that creates a new ParkingMeter object with this ParkingMeter's data fields.
     *
     * @return A copy of this ParkingMeter Object
     */
    public ParkingMeter copy(){
        return new ParkingMeter(payment);
    }

    /** Overridden toString Method that formats the data fields
     *
     * @return A new reformatted String for the Object
     */
    @Override
    public String toString() {
        return "Payment: $" + payment
                + "\nMinutes purchased: " + minutesPurchased;
    }
}
