package lesson6;

public class Student22 {
    int student_ID;
    String name;
    String surname;
    int year_of_study;
    double average_math;
    double average_economy;
    double average_language;

    Student22(int student_ID2, String name2, String surname2, int year_of_study2, double average_math2, double average_economy2, double average_language2) {
        student_ID = student_ID2;
        name = name2;
        surname = surname2;
        year_of_study = year_of_study2;
        average_math = average_math2;
        average_economy = average_economy2;
        average_language = average_language2;
    }

    Student22(int student_ID3, String name3, String surname3, int year_of_study3) {
        this(student_ID3, name3, surname3, year_of_study3, 0.0, 0.0, 0.0);
    }

    Student22() {
        this(0, null, null, 0, 0.0, 0.0, 0.0);
    }
}

class StudentTest22 {
    void student_avr(Student22 stud) {
        double result = (stud.average_economy + stud.average_language + stud.average_math) / 3;
        System.out.println("Student " + stud.name + " " + stud.surname + " have AVR: " + result);
    }

    public static void main(String[] args) {

        Student22 stud1 = new Student22(1, "Alex", "Below", 1984, 5.5, 6.3, 7.1);

        Student22 stud2 = new Student22(2, "Ivan", "Ivanov", 1999);
        stud2.average_math = 3.3;
        stud2.average_economy = 4.4;
        stud2.average_language = 2.2;

        Student22 stud3 = new Student22();
        stud3.student_ID = 3;
        stud3.name = "Victor";
        stud3.surname = "Victorov";
        stud3.year_of_study = 2001;
        stud3.average_economy = 8;
        stud3.average_language = 5;
        stud3.average_math = 2;

        StudentTest22 studTest = new StudentTest22();

        studTest.student_avr(stud1);
        studTest.student_avr(stud2);
        studTest.student_avr(stud3);
    }
}
