package lesson6;

public class Summa {

    void summa(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    void summa(int a, int b, int c) {
        summa(a, b, c, 0);
    }
    void summa(int a, int b) {
        summa(a, b, 0, 0);
    }
    void summa(int a) {
        summa(a, 0, 0, 0);
    }
    void summa() {
        summa(0, 0, 0, 0);
    }

    public static void main(String[] args) {

        Summa sm = new Summa();
        sm.summa(3,5,7,11);
        sm.summa(3,5,7);
        sm.summa(3,5);
        sm.summa(3);
        sm.summa();
    }
}
