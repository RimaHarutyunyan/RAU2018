package day3;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private final int age;
    private String fullName;
    private String faculty;

    //    public Student(){
//
//    }
    public Student(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

//    public Student(int yearOfBirthday, String fullName) {
//        this.age = LocalDate.now().getYear() -  yearOfBirthday;
//        this.fullName = fullName;
//    }

    public Student(String fullName, int yearOfBirthday) {
        this.age = LocalDate.now().getYear() -  yearOfBirthday;
        this.fullName = fullName;
    }

    public Student(int age, String fullName, String faculty) {
        this(age, fullName);
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public boolean equals(Student that) {
        return this.age == that.age
                && (this.fullName == null && that.fullName == null || this.fullName != null && this.fullName.equals(that.fullName))
                //&& (this.fullName == that.fullName  || this.fullName != null && this.fullName.equals(that.fullName))
                && Objects.equals(this.faculty, that.faculty);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {//obj != null && obj.getClass().equals(this.getClass())
            Student that = (Student) obj;
            return this.age == that.age
                    && Objects.equals(this.fullName, that.fullName)
                    && Objects.equals(this.faculty, that.faculty);
        }
        else {
            return false;
        }

    }
    public static Student createStudent(int age, String name){
        return new Student(age, name);
    }

    public static Student createStudentByBirthYear(int year, String name){
        return new Student(name, year);
    }

    public static Student createStudentInFaculty(int age, String name, String faculty){
        return new Student(age, name, faculty);
    }


    public static void main(String[] args) {

        Student student1 = new Student(19, "Armen");
        student1.setFaculty("Applied Mathematics & Informatics");
        Student student2 = new Student(19, "Katya", "Applied Mathematics & Informatics");

        Student student3 = Student.createStudent(19, "Katya");
//        student3 = Student.createStudentInFaculty(19, "Katya", "Applied Mathematics & Informatics");
//        Student student4 = Student.createStudentByBirthYear(1999, "Katya");

    }
}
