public class Assignment3Demo {
    public static void main(String[] args){
        //Essay essay = new Essay(5,20,20,30);
        //System.out.println(essay);
        CourseGrades grades = new CourseGrades();
        GradedActivity gradedActivity = new GradedActivity();
        gradedActivity.setScore(87.8);
        grades.setLab(gradedActivity);
        grades.setPassFailExam(new PassFailExam(10,3,70));
        grades.setEssay(new Essay(20, 19.5, 20, 30));
        grades.setFinalExam(new FinalExam(50, 20));
        System.out.println(grades);
    }
}
