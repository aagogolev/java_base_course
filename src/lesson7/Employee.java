package lesson7;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showId() {
        System.out.println(id);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public Employee(int id2, String surname2, double salary2) {
        id = id2;
        surname = surname2;
        salary = salary2;
    }

    private Employee(String surname2, int id2, double salary2) {
        id = id2;
        surname = surname2;
        salary = salary2;
    }

    Employee(double salary2, String surname2, int id2) {
        id = id2;
        surname = surname2;
        salary = salary2;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        //вызов публичного констуктора
        Employee emp1 = new Employee(1, "Ivanov", 2000.0);
        //System.out.println(emp1.salary); неотработает так как переменная salary приватная
        emp1.showSalary();
        emp1.showSurname();
        emp1.showId();
        System.out.println(emp1.surname);
        System.out.println(emp1.id);

        //Employee emp2 = new Employee("Petrov", 20, 1000.9); не отрабоатет так как конструктор приватный

        Employee emp3 = new Employee(1000.0, "Smirnov", 3);
        emp3.showSalary();
        emp3.showSurname();
        emp3.showId();
        System.out.println(emp3.surname);
        System.out.println(emp3.id);


    }
}