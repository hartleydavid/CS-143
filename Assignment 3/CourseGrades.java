/**
 * @author David Hartley CS 143 Assignment #3
 *          Based off Programming Challenge 10-5
 *          Class has an array of Graded Activities representing the course grades by a teacher.
 *          The grades include a lab, PassFail Exam, Essay, and Final exam
 *
 */
public class CourseGrades {
    //Data-Field for each of the assignments the teacher sets. Set to length 4 for each
    GradedActivity[] grades = new GradedActivity[4];

    /** Setter for the first course grade activity. Copies GradedActivity object and puts in index 0 of array
     *
     * @param lab A Graded Activity Object with a pre-set grade
     */
    public void setLab(GradedActivity lab){
        GradedActivity labCopy = new GradedActivity();
        labCopy.setScore(lab.getScore());
        grades[0] = labCopy;
    }

    /** Setter for the second course grade activity. Copies PassFailExam object and puts in index 1 of array
     *  All Pass Fail Exams are 10 questions long with a 70% minimum passing grade
     * @param passFailExam A PassFailExam Object with a pre-set grade.
     */
    public void setPassFailExam(PassFailExam passFailExam){
        grades[1] = new PassFailExam(10, passFailExam.getNumMissed(), 70);
    }

    /** Setter for the third course grade activity. Copies Essay object and puts in index 2 of array
     *
     * @param essay A Essay Object with a pre-set grade.
     */
    public void setEssay(Essay essay){
        grades[2] = new Essay(essay.getGrammar(), essay.getSpelling(), essay.getCorrectLength(), essay.getContent());
    }

    /** Setter for the fourth course grade activity. Copies Essay object and puts in index 3 of array
     * All Final Exams are 50 questions long
     * @param finalExam A FinalExam Object with a pre-set grade.
     */
    public void setFinalExam(FinalExam finalExam){
        grades[3] = new FinalExam(50, finalExam.getNumMissed());
    }

    /** Overridden toString method that returns all the Scores and grades of each Graded Activity in the grades array
     *
     * @return All the Scores and grades of each Graded Activity in the grades array
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(GradedActivity activity : grades){
            stringBuilder.append("Score: ").append(activity.getScore()).append("\n");
            stringBuilder.append("Grade: ").append(activity.getGrade()).append("\n");
        }
        return stringBuilder.toString();
    }
}
