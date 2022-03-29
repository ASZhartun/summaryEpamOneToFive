package block4.simplestClassesAndObjects.task03;

import java.util.ArrayList;

public class Student {
    private String lastName;
    private String initials;
    private int groupNumber;
    private int[] rating;

    public Student(String lastName, String initials, int groupNumber, int[] rating) {
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.rating = rating;
    }

    /**
     * Print and return top students.
     * @param list array of all students to be checked.
     * @return ArrayList<Students> is the best ratings.
     */
    public static ArrayList<Student> getTopStudents(Student[] list) {
        ArrayList<Student> tops = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (isTop(list[i])) {
                tops.add(list[i]);
                printStudent(list[i]);
            }
        }
        return tops;
    }

    /**
     * Print student according to description of task.
     * @param student student to be printed.
     */
    public static void printStudent(Student student) {
        System.out.println(student.getLastName() +" "+  student.getInitials() + " from " + student.getGroupNumber());
    }

    /**
     * Check student is has only 9 or 10 marks.
     * @param student student to be checked.
     * @return true if student has only 9 or 10 marks at his rating.
     */
    public static boolean isTop(Student student) {
        int[] rating = student.getRating();
        for (int i = 0; i < rating.length; i++) {
            if (rating[i]<9) return false;
        }
        return true;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitials() {
        return initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getRating() {
        return rating;
    }
}
