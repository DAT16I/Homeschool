package dk.lasseborly;

import dk.lasseborly.Controller.TeacherController;
import dk.lasseborly.Model.Teacher;
import dk.lasseborly.View.TeacherView;

public class Main {

    public static void main(String[] args) {

        Teacher teacher01 = Teacher.get(101);
        TeacherView view01 = new TeacherView();
        TeacherController controller01 = new TeacherController(view01, teacher01);

        controller01.updateView();
        controller01.setTeacherName("Peter");
        controller01.updateView();

    }

}
