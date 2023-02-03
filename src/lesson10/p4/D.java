package lesson10.p4;

import lesson10.p1.A;
import lesson10.p1.p2.p3.C;
import lesson10.p4.p5.E;

import static lesson10.p1.p2.B.countB;

public class D {

    public void showD() {
        System.out.println("Class D");
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.showA();

        C c1 = new C();
        c1.showC();

        E e1 = new E();
        e1.showE();

        System.out.println(countB);

    }
}
