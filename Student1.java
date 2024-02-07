import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student1 extends StudentCourses {
    String name;
    String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age);
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "Srushti A Sandigawad";
        s.displayName();
        s.displayAge("12-03-2004");
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayStudentMarks();
    }
}
