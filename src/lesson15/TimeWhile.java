package lesson15;

public class TimeWhile {
    static void time() {
        int hour = 0;
        HOUR:
        while (hour < 6) {
            int min = 0;
            MINUTE:
            do {
                if (hour > 1 && min % 10 == 0) {
                    System.out.println("Method canceled");
                    break HOUR;
                }
                int sec = 0;
                SECOND:
                while (sec <= 59) {
                    sec++;
                    if (sec * hour > min) {
                        System.out.println("Continue method");
                        min++;
                        continue MINUTE;
                    }
                    System.out.println("Time is--> " + hour + ":" + min + ":" + sec);
                }
                min++;
            } while (min < 60);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
