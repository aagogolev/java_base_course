package lesson12;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest {

    void comparison_class(Student st1, Student st2){
        if (st1.name.equals(st2.name) && (st1.course == st2.course) && (st1.grade == st2.grade)){
            System.out.println("Class is comparison");
        }
        else {
            System.out.println("Class not comparison");
        }
    }
    void comparison_elem_class(Student st1, Student st2){
        if (st1.name.equals(st2.name)){
            if (st1.grade == st2.grade){
                if (st1.course == st2.course){
                    System.out.println("Name course gradle if comparison");
                }
                else {
                    System.out.println("Name gradle if comparison");
                }
            }
            else {
                System.out.println("Name if comparison");
            }
        }
        else {
            System.out.println("Name not comparison");
        }
    }
    public static void main(String[] args) {

        Student st1 = new Student("Alex", 2, 10.1);
        Student st2 = new Student("Alex", 2, 10.1);
        Student st3 = new Student("Victor", 3, 12);
        Student st4 = new Student("Alex", 4, 10.1);

        StudentTest st = new StudentTest();

        st.comparison_class(st1, st2);
        st.comparison_class(st1, st3);
        System.out.println();
        st.comparison_elem_class(st1,st2);
        st.comparison_elem_class(st1,st3);
        st.comparison_elem_class(st1,st4);


    }
}