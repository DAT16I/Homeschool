package dk.lasseborly.Model;

public class Teacher extends User {

    private int salary;

    public Teacher(int id, String name, int salary) {

        super(id, name);
        this.salary = salary;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //We are mocking a database retrieval here.
    public static Teacher get(int id) {
        return new Teacher(id, "Lasse", 10);
    }

    //We are mocking a database save here.
    public boolean save() {
        return true;
    }

}
