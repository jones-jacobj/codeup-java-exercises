package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("David");
//        s1.addGrades(23,87,56,84,63);
        s1.addGrade(23);
        s1.addGrade(87);
        s1.addGrade(56);
        s1.addGrade(84);
        s1.addGrade(63);
        System.out.println(s1.getGradeAverage());
    }
}
