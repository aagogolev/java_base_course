package lesson6;

public class Summa {
    void summa(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }
    void summa(int a, int b, int c, int d) {
        summa(a, b, c, d, 0);
    }
    void summa(int a, int b, int c) {
        summa(a, b, c, 0, 0);
    }
    void summa(int a, int b) {
        summa(a, b, 0, 0, 0);
    }
    void summa(int a) {
        summa(a, 0, 0, 0, 0);
    }
    void summa() {
        summa(0, 0, 0, 0, 0);
    }

    public static void main(String[] args) {

        Summa sm = new Summa();
        sm.summa(1,1,1,1,1);
        sm.summa(1,1,1,1);
        sm.summa(1,1,1);
        sm.summa(1,1);
        sm.summa(1);
        sm.summa();
    }
}
