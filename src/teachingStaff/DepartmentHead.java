package teachingStaff;

import assignments.ManagingLab;
import assignments.PreparingSubject;
import assignments.Teaching;
import facultyStaff.FacultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public class DepartmentHead extends FacultyStaff implements Teaching, ManagingLab, PreparingSubject {

    public DepartmentHead(String name, String NationalId, int salary) {
        super(name, NationalId, salary);
    }

    @Override
    public void teach() {
        System.out.println("Department Head teaching");
    }

    @Override
    public void manageLabs() {
        System.out.println("Department Head manage Labs");
    }

    @Override
    public void PrepareSubject() {
        System.out.println("Department Head Prepare Subject");
    }

    public void manageDepartment() {
        System.out.println("Department Head manage Department");
    }

}
