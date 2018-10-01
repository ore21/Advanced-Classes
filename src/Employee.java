public class Employee {
    public enum PositionTitle{
        Administration, Production, Sales, Maintenance, Technical, Secretarial;
    }

    String EmployeeName;
    PositionTitle EmployeePosition;
    int EmployeeShift; // shift is an int of 1,2 or 3
    double EmployeeSalary;
    String EmployeeStDate;
    double EmployeePayRate;

    public Employee(String EmployeeName, PositionTitle EmployeePosition, int EmployeeShift, double EmployeeSalary,
                    String EmployeeStDate, double EmployeePayRate) {
        this.EmployeeName = EmployeeName;
        this.EmployeePosition = EmployeePosition;
        this.EmployeeShift = EmployeeShift;
        this.EmployeeSalary = EmployeeSalary;
        this.EmployeeStDate = EmployeeStDate;
        this.EmployeePayRate = EmployeePayRate;
    }
    public void calculate(double hoursIn){
        double pay = 0;
        double overt = 0.0;
        double overtPay = 0.0;

        if (hoursIn > 40 ){
            overt = hoursIn - 40;
            hoursIn = 40;
            overtPay = overt * EmployeePayRate * 1.5;

        }

        if (EmployeeShift == 2){
            pay = hoursIn * EmployeePayRate * 1.05 + overtPay * 1.05;
        }else if (EmployeeShift == 3){
            pay = hoursIn * EmployeePayRate * 1.10 + overtPay * 1.10;
        }else{
            pay = hoursIn * EmployeePayRate + overtPay;
        }
        System.out.println("Employee Name: " + EmployeeName + "\n\tEmployee Position: " + EmployeePosition +
                "\n\tEmployeeShift: " + EmployeeShift + "\n\tEmployee Salary: " + EmployeeSalary +
                "\n\tEmployee Start Date: " + EmployeeStDate + "\n\tEmployee Pay Rate: " + EmployeePayRate);


    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public PositionTitle getEmployeePosition() {
        return EmployeePosition;
    }

    public void setEmployeePosition(PositionTitle employeePosition) {
        this.EmployeePosition = employeePosition;
    }

    public int getEmployeeShift() {
        return EmployeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.EmployeeShift = employeeShift;
    }

    public double isEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public String getEmployeeStDate() {
        return EmployeeStDate;
    }

    public void setEmployeeStDate(String employeeStDate) {
        EmployeeStDate = employeeStDate;
    }

    public double getEmployeePayRate() {
        return EmployeePayRate;
    }

    public void setEmployeePayRate(double employeePayRate) {
        EmployeePayRate = employeePayRate;

        System.out.println("Employee Name: " + EmployeeName + "\n" + "Employee Position: " + EmployeePosition + "\n" +
                "Employee Shift: " + EmployeeShift + "\n" + "Employee Salary: " + EmployeeSalary + "\n" +
                "Employee Start Date: " + EmployeeStDate + "\n" + "Employee Pay Rate: " + EmployeePayRate);
    }
}




