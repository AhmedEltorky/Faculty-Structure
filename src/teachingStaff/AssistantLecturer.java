package teachingStaff;

import assignments.ManagingLab;
import assignments.PostGraduateStudy;
import assignments.Teaching;
import facultyStaff.FacultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public class AssistantLecturer extends FacultyStaff implements Teaching, PostGraduateStudy, ManagingLab {

    public AssistantLecturer(String name, String NationalId, int salary) {
        super(name, NationalId, salary);
    }

    @Override
    public void teach() {
        System.out.println("Assistant Lecturer teaching");
    }

    @Override
    public void takePostGraduateStudy() {
        System.out.println("Assistant Lecturer takeing Post Graduate Study");
    }

    @Override
    public void manageLabs() {
        System.out.println("Assistant Lecturer managing Labs");
    }

    public void guide(TeachingAssistant tas) {
        System.out.println("Assistant Lecturer guide Teaching assistant");
    }

}
