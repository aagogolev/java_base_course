package lesson5;

public class lesson5 {
    int summa(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
}

class Test5{
    public static void main(String[] args) {
        lesson5 t = new lesson5();

        int sum = t.summa(1, 2 , 3);
        System.out.println(sum);
    }
}