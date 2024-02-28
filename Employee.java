public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
    public Employee(String name, String birthDate, String endDate, long employeeId) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
    }

    public Employee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
