package lesson4;

public class Student {
    int student_ID;
    String name;
    String surname;
    int year_of_study;
    double average_math;
    double average_economy;
    double average_language;

}

class StudentTest{
    public static void main(String[] args) {

        Student alex = new Student();
        alex.student_ID = 11111;
        alex.name = "alex";
        alex.surname = "belov";
        alex.year_of_study = 1984;
        alex.average_math = 5;
        alex.average_economy = 3;
        alex.average_language = 2;

        double alex_avr_full = (alex.average_math + alex.average_economy + alex.average_language)/3;

        System.out.println("Аlex has an average score= " + String.format("%.2f",alex_avr_full));

        Student ivan = new Student();
        ivan.student_ID = 11111;
        ivan.name = "ivan";
        ivan.surname = "ivanov";
        ivan.year_of_study = 1888;
        ivan.average_math = 4;
        ivan.average_economy = 1;
        ivan.average_language = 3;

        double ivan_avr_full = (ivan.average_math + ivan.average_economy + ivan.average_language)/3;

        System.out.println("Ivan has an average score= " + String.format("%.2f",ivan_avr_full));

        Student irina = new Student();
        irina.student_ID = 11111;
        irina.name = "irina";
        irina.surname = "petrova";
        irina.year_of_study = 1992;
        irina.average_math = 5;
        irina.average_economy = 5;
        irina.average_language = 2;

        double irina_avr_full = (irina.average_math + irina.average_economy + irina.average_language)/3;

        System.out.println("Irina has an average score= " + String.format("%.2f",irina_avr_full));
        System.out.println(irina);
    }
}
