package teachingStaff;

import assignments.ManagingLab;
import assignments.PreparingSubject;
import assignments.Teaching;
import facultyStaff.FacultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public class Doctor extends FacultyStaff implements Teaching, ManagingLab, PreparingSubject {

    public Doctor(String name, String NationalId, int salary) {
        super(name, NationalId, salary);
    }

    @Override
    public void teach() {
        System.out.println("Doctor teaching");
    }

    @Override
    public void manageLabs() {
        System.out.println("Doctor manage Labs");
    }

    @Override
    public void PrepareSubject() {
        System.out.println("Doctor Prepare Subject");
    }

}
