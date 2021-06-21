/**
 * @author David Hartley CS 143 Assignment #3
 *          Based off Programming Challenge 10-4
 *          Is a class to represent a graded essay that has a grammar, spelling, length, and content grade
 *
 */
public class Essay extends GradedActivity {
    //Data Fields to hold numeric Score of grammar, spelling, correct length, and content grades respectively
    private double grammar, spelling, correctLength, content;

    /** 4-arg Constructor that sets the data fields
     * Essay grade can be up to 100 points
     * @param grammar The grammar score
     * @param spelling The spelling score
     * @param correctLength The Correct length score
     * @param content The content score
     *
     * @throws IllegalArgumentException when parameters go over the sub-grade maximums
     */
    public Essay(double grammar, double spelling, double correctLength, double content) {
        if(grammar > 30) throw new IllegalArgumentException("Grammar score can not exceed 30 points");
        if(spelling > 20) throw new IllegalArgumentException("Spelling score can not exceed 20 points");
        if(correctLength > 20) throw new IllegalArgumentException("Correct Length score can not exceed 20 points");
        if(content > 30) throw new IllegalArgumentException("Content score can not exceed 30 points");
        //Set data fields
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
        //Set the score for the superclass
        setScore(grammar + spelling + correctLength + content);
    }

    /** Getter for the grammar score
     *
     * @return The grammar score
     */
    public double getGrammar() {
        return grammar;
    }

    /** Setter for the grammar score
     *
     * @param grammar The new grammar score
     */
    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    /** Getter for the spelling score
     *
     * @return The spelling score
     */
    public double getSpelling() {
        return spelling;
    }
    /** Setter for the spelling score
     *
     * @param spelling The new spelling score
     */
    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    /** Getter for the length score
     *
     * @return The correct length score
     */
    public double getCorrectLength() {
        return correctLength;
    }
    /** Setter for the correct length score
     *
     * @param correctLength The new correct length score
     */
    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    /** Getter for the content score
     *
     * @return The content score
     */
    public double getContent() {
        return content;
    }

    /** Setter for the content score
     *
     * @param content The new content score
     */
    public void setContent(double content) {
        this.content = content;
    }

    /** Overridden toString method that returns a breakdown of the the grades on the essay
     *
     * @return A string representing the breakdown of the grades received for the essay object
     */
    @Override
    public String toString(){
        return "Essay Grade Breakdown:"
                +"\nGrammar: " + grammar + "/30"
                +"\nSpelling: " + spelling + "/20"
                +"\nLength: " + correctLength + "/20"
                +"\nContent: " + content + "/30"
                +"\nFinal Score: "+ getScore()
                +"\nFinal Grade: " + getGrade();
    }
}