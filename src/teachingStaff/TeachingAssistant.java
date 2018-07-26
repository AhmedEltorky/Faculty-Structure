package teachingStaff;

import assignments.ManagingLab;
import assignments.PostGraduateStudy;
import assignments.Teaching;
import facultyStaff.FacultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public class TeachingAssistant extends FacultyStaff implements Teaching, ManagingLab, PostGraduateStudy {

    public TeachingAssistant(String name, String NationalId, int salary) {
        super(name, NationalId, salary);
    }

    @Override
    public void teach() {
        System.out.println("Teaching Assistant teaching");
    }

    @Override
    public void manageLabs() {
        System.out.println("Teaching Assistant manage Labs");
    }

    @Override
    public void takePostGraduateStudy() {
        System.out.println("Teaching Assistant take Post GraduateStudy");
    }

}
