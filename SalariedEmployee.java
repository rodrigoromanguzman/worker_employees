public class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(String name, String birthDate, String endDate, int employeeId) {
        super(name, birthDate, endDate, employeeId);
    }

    //Overrride methods from Worker
    @Override
    public double collectPay(){
        double payCheck = annualSalary/26;
        double adjustedPay = (isRetired)?0.0*payCheck:payCheck;
        return (int) adjustedPay;
    }
    //Method for SalariedEmployee
    public void retire(){
        terminate("12/12/2024");
        isRetired = true;
    }

}
