package lesson14;

public class Time {
    static void time() {

        HOUR:
        for (int hour = 0; hour < 6; hour++) {
            MINUTE:
            for (int min = 0; min < 60; min++) {

                if (hour > 1 && min % 10 == 0) {
                    System.out.println("Method canceled");
                    break HOUR;
                }
                SECOND:
                for (int sec = 0; sec <= 59; sec++) {
                    if (sec * hour > min) {
                        System.out.println("Continue method");
                        continue MINUTE;
                    }
                    System.out.println("Time is--> " + hour + ":" + min + ":" + sec);
                }
            }
        }

    }

    public static void main(String[] args) {
        time();
    }
}
