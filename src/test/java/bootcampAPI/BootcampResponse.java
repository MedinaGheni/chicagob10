package bootcampAPI;
import lombok.Data;

import java.util.List;

@Data
public class BootcampResponse {

    private List<BootcampInstructor> instructors;
    private List<BootcampInstructor> students;

    public List<BootcampInstructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<BootcampInstructor> instructors) {
        this.instructors = instructors;
    }

    public List<BootcampInstructor> getStudents() {
        return students;
    }

    public void setStudents(List<BootcampInstructor> students) {
        this.students = students;
    }
}