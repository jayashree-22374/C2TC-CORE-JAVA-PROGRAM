package day12.UserDefinedException;

public class StudentService {

    public void setMarks(Student st, int[] marks) throws InvalidMarksException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException("Invalid marks found: " + mark + ". Marks should be between 0 and 100.");
            }
        }
        st.setMarks(marks);
        calculatePercentage(st);
    }

    private void calculatePercentage(Student student) {
        int[] marks = student.getMarks();
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        float percentage = (float) sum / marks.length;
        student.setPer(percentage);
    }

}
