package samplearrays;

public class CourseNumbersArray {
    private int[] registeredCourses;
    public CourseNumbersArray(int[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
    public void addNewCourse(int courseNumber){
        int[] updatedCourses = new int[registeredCourses.length+1];
        for (int i=0; i<registeredCourses.length; i++){
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[registeredCourses.length] = courseNumber;
        registeredCourses = updatedCourses;
    }
    public void printRegisteredCourses(){
        System.out.println("Courses: ");
        for (int i=0; i<registeredCourses.length; i++){
            System.out.print(registeredCourses[i] + " ");
        }
    }
    public boolean containsCourse(int courseNumber){
        for (int i=0; i<registeredCourses.length; i++){
            if (registeredCourses[i] == courseNumber){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        CourseNumbersArray courseNumbersArray1 = new CourseNumbersArray(registeredCourses);
        courseNumbersArray1.addNewCourse(110);
        courseNumbersArray1.addNewCourse(210);
        courseNumbersArray1.printRegisteredCourses();
        System.out.println("\n\n'The course with number 210 is in the student's courses is :' " + courseNumbersArray1.containsCourse(210));
    }
}
