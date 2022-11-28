package grades;

import java.util.ArrayList;
import java.util.Collection;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name=name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, Collection<Integer> givenGrades){
        this.name=name;
        this.grades = new ArrayList<>(givenGrades);
    }

    public String getName(){return this.name;}
    public void addGrade(int givenGrade){this.grades.add(givenGrade);}

    public Student addGrade2(int givenGrade){
        this.grades.add(givenGrade);
        return this;
    }
    public void addGrades(Collection<Integer> givenGrades){
        for (int grade : givenGrades){
            this.grades.add(grade);
        }
    }
    public double getGradeAverage(){
        double count = 0;
        double numbers = 0;
        for (int grade : this.grades) {
            numbers += grade;
            count++;
        }
        return (numbers / count);
    }
}
