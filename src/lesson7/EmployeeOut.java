package lesson7;

public class EmployeeOut {
    public static void main(String[] args) {
        Employee emp4 = new Employee(4, "Kirilow", 500.0);
        emp4.showSalary();
        emp4.showSurname();
        emp4.showId();
        System.out.println(emp4.surname);
        System.out.println(emp4.id);

        Employee emp5 = new Employee(700.0, "Mironov", 5);
        emp5.showSalary();
        emp5.showSurname();
        emp5.showId();
        System.out.println(emp5.surname);
        System.out.println(emp5.id);
    }
}
