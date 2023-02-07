package lesson13;

public class Month {
   static void switch_month(int month) {

        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println("in month 31 day");
                break;
            case (2):
                System.out.println("in month 28 day");
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println("in month 30 day");
                break;
            default:
                System.out.println("invalid month");
        }
    }

    public static void main(String[] args) {
        switch_month(1);
        switch_month(2);
        switch_month(3);
        switch_month(4);
        switch_month(5);
        switch_month(6);
        switch_month(7);
        switch_month(8);
        switch_month(9);
        switch_month(10);
        switch_month(11);
        switch_month(12);
    }
}
