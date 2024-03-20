package Package1;

public class gradeBook {

    public String displayMesage(){
        return "Welcome to the GradeBook1, it is: " + getCourseName();
    }
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
