package employee;

import assignments.ManagingLab;
import facultyStaff.FacultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public class LabAssistant extends FacultyStaff implements ManagingLab {

    public LabAssistant(String name, String NationalId, int salary) {
        super(name, NationalId, salary);
    }

    @Override
    public void manageLabs() {
        System.out.println("Lab Assistant manage Labs");
    }

}
