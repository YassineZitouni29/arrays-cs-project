package samplearrays;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for(int i = 0; i < students.length; i++){
            if(students[i].getAge() >= oldest.getAge()){
                oldest = students[i];
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].getAge() >= 18){
                count++;
            }
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        if (students.length == 0) return Double.NaN;

        int sum = 0;
        for(int i = 0; i < students.length; i++){
            sum += students[i].getGrade();
        }
        return (double) sum / students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        int n = students.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getGrade() < students[j + 1].getGrade()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for (Student student : students) {
            if (student.getGrade() >= 15) {
                System.out.println(student);
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getName().equalsIgnoreCase(students[i].getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = newStudent;
        return newStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = {
                new Student(12, "yassine", 20, 17),
                new Student(13, "hamza", 21, 14),
                new Student(16, "rayan", 20, 18),
                new Student(19, "manal", 19, 12),
                new Student(21, "rhita", 19, 18)
        };

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("Oldest student is : " + findOldest(arr));

        // 3) Count adults
        System.out.println("The number of adult students is : " + countAdults(arr));

        // 4) Average grade
        System.out.println("The average grade of the student is : " + averageGrade(arr));

        // 5) Find by name
        System.out.println("The student whose name is yassine is " + findStudentByName(arr, "yassine"));

        // 6) Sort by grade desc
        // sort function
        sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        updateGrade(arr, 12, 20);
        System.out.println("The student whose name is yassine is " + findStudentByName(arr, "yassine"));

        // 9) Duplicate names
        System.out.println("'The array of students contains duplicates is : ' " + hasDuplicateNames(arr));

        // 10) Append new student
        Student student1 = new Student(28, "imad", 20, 17);
        arr = appendStudent(arr, student1);
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
    }
}

