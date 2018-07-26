package employee;

import facultyStaff.FacultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public class SecurityGuard extends FacultyStaff {

    public SecurityGuard(String name, String NationalId, int salary) {
        super(name, NationalId, salary);
    }

    public void secureFaculty() {
        System.out.println("Security Guard secure Faculty");
    }

}
