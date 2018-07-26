package teachingStaff;

import assignments.ManagingLab;
import assignments.PreparingSubject;
import assignments.Teaching;
import facultyStaff.FacultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public class Dean extends FacultyStaff implements Teaching, ManagingLab, PreparingSubject {

    public Dean(String name, String NationalId, int salary) {
        super(name, NationalId, salary);
    }

    @Override
    public void teach() {
        System.out.println("Dean teaching");
    }

    @Override
    public void manageLabs() {
        System.out.println("Dean manage Labs");
    }

    @Override
    public void PrepareSubject() {
        System.out.println("Dean Prepare Subject");
    }

    public void manageFaculty() {
        System.out.println("Dean manage faculty");
    }

}
