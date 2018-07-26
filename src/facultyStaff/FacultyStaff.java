package facultyStaff;

/**
 *
 * @author Ahmed El-Torky
 */
public abstract class FacultyStaff {

    private String name;
    private String NationalId;
    private int salary;

    public FacultyStaff(String name, String NationalId, int salary) {
        this.name = name;
        this.NationalId = NationalId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return NationalId;
    }

    public void setNationalId(String NationalId) {
        this.NationalId = NationalId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
