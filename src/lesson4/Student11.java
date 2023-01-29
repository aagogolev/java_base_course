package lesson4;

public class Student11 {
    int student_ID;
    String name;
    String surname;
    int year_of_study;
    double average_math;
    double average_economy;
    double average_language;

}

class StudentTest11 {
    void student_avr(Student stud) {
        double result = (stud.average_economy + stud.average_language + stud.average_math) / 3;
        System.out.println("Student " + stud.name + " " + stud.surname + " have AVR: " + result);
    }

    public static void main(String[] args) {

        Student alex = new Student();
        alex.student_ID = 11111;
        alex.name = "alex";
        alex.surname = "belov";
        alex.year_of_study = 1984;
        alex.average_math = 5;
        alex.average_economy = 3;
        alex.average_language = 2;

        Student ivan = new Student();
        ivan.student_ID = 11111;
        ivan.name = "ivan";
        ivan.surname = "ivanov";
        ivan.year_of_study = 1888;
        ivan.average_math = 4;
        ivan.average_economy = 1;
        ivan.average_language = 3;

        Student irina = new Student();
        irina.student_ID = 11111;
        irina.name = "irina";
        irina.surname = "petrova";
        irina.year_of_study = 1992;
        irina.average_math = 5;
        irina.average_economy = 5;
        irina.average_language = 2;

        StudentTest11 stud1 = new StudentTest11();

        stud1.student_avr(irina);
        stud1.student_avr(ivan);
        stud1.student_avr(alex);
    }
}
