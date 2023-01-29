package lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    void addSalary() {
        salary *= 2;
    }

    void info() {
        System.out.println("Sotrudnik " + surname + " zarplata: " + salary);
    }

    Employee(int id2, String sur2, int age2, double salary2, String dep2) {
        id = id2;
        surname = sur2;
        age = age2;
        salary = salary2;
        department = dep2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee sotr1 = new Employee(1, "Petrov", 22, 30000, "IT");
        sotr1.info();
        Employee sotr2 = new Employee(2, "Ivanov", 30, 50000, "Managers");
        sotr2.info();

        sotr1.addSalary();
        sotr1.info();
        sotr2.addSalary();
        sotr2.info();
    }
}
