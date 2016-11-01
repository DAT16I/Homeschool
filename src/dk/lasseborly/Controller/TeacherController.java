package dk.lasseborly.Controller;

import dk.lasseborly.Model.Teacher;
import dk.lasseborly.View.TeacherView;

public class TeacherController {

    private TeacherView view;
    private Teacher model;

    public TeacherController(TeacherView view, Teacher model) {

        this.view = view;
        this.model = model;

    }

    public void setTeacherName(String teacherName) {
        this.model.setName(teacherName);
    }

    public String getTeacherName() {
        return this.model.getName();
    }

    public void updateView() {

        view.printTeacherDetails(
                this.model.getId(),
                this.model.getName(),
                this.model.getSalary()
        );

    }


}
