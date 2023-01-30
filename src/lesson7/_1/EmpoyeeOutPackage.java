package lesson7._1;

public class EmpoyeeOutPackage {
    public static void main(String[] args) {
        lesson7.Employee emp6 = new lesson7.Employee(6, "Borisov", 300.0);
        emp6.showSalary();
        emp6.showSurname();
        emp6.showId();
        System.out.println(emp6.surname);
        //System.out.println(emp6.id); не откработает так как используется дефолтный конструктор
    }
}
