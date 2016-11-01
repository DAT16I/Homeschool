package dk.lasseborly.View;

public class TeacherView {

    public void printUserDetails(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public void printTeacherDetails(int teacherId, String teacherName, int teacherSalary) {

        System.out.println("ID: " + teacherId);
        System.out.println("Name: " + teacherName);
        System.out.println("Salary: " + teacherSalary + "kr");

    }

}
