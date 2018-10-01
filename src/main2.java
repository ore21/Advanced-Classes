public class main2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Jane Doe", Employee.PositionTitle.Administration,
                    1, 27.00, "09/14/89", 12.6);
        Employee emp3 = new Employee("John Smith", Employee.PositionTitle.Maintenance,
                    2, 21.00, "05/23/89", 13.8);
        Employee emp2 = new Employee("Larry Jackson", Employee.PositionTitle.Production,
                    3, 22.00, "07/15/89", 22.7);


        emp1.calculate(45);
        emp2.calculate(50);
        emp3.calculate(35);

    }
}
