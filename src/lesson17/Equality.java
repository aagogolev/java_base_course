package lesson17;

public class Equality {
    public static boolean equality(StringBuilder st1, StringBuilder st2) {
        boolean result = true;

        if (st1.length() == st2.length()) {
            for (int i = 0; i < st1.length(); i++) {
                if (st1.charAt(i) != st2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("string");
        StringBuilder str2 = new StringBuilder("string");
        System.out.println(equality(str1, str2));
        StringBuilder str3 = new StringBuilder("abc");
        StringBuilder str4 = new StringBuilder("adcd");
        System.out.println(equality(str3, str4));
        StringBuilder str5 = new StringBuilder("abc");
        StringBuilder str6 = new StringBuilder("abd");
        System.out.println(equality(str5, str6));
    }
}
