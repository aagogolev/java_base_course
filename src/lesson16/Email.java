package lesson16;


public class Email {
    void email(String email) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < email.length() - 1) {
            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1);
            System.out.println(email.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Email email1 = new Email();
        email1.email("ya@yahoo.com;  on@mail.ru;  ona@gmail.ru;");
    }
}
