package lesson9;

public class EightObject {
    public static void createObject(){
        String str1 = new String ("11111");
        String str2 = new String ("22222");
    }

    public static void main(String[] args) {
        EightObject eO1 = new EightObject();
        EightObject eO2 = new EightObject();

        createObject();
        createObject();
        createObject();
    }
}
