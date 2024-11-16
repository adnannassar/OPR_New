package Vorlesung.HuellenKlassen.String;

public class Main {
    public static void main(String[] args) {

        testIgnoreCase1();

        String numberAsString = String.valueOf(10);

        String name = "John";
        System.out.println("length: " + name.length());
        // upercase
        System.out.println("uppercase: " + name.toUpperCase());
        // lowercase
        System.out.println("lowercase: " + name.toLowerCase());
        // replace
        System.out.println("replace: " + name.replace("J", "K"));
        // substring
        String erg = name.substring(1, 3); // 1 is inclusive, 3 is exclusive
        System.out.println("substring: " + erg);
        // concat
        String x = "abc";
        System.out.println("concat: " + x.concat("def"));
        // startsWith
        System.out.println("startsWith: " + name.startsWith("J"));
        // endsWith
        System.out.println("endsWith: " + name.endsWith("n"));
        // charAt
        System.out.println("charAt: " + name.charAt(0));
        // indexOf
        System.out.println("indexOf: " + name.indexOf("J"));
        // toCharArray
        char[] nameAsCharArray = name.toCharArray();
        System.out.println("toCharArray: " + nameAsCharArray[0] + nameAsCharArray[1] + nameAsCharArray[2] + nameAsCharArray[3]);
    }


    public static void testIgnoreCase1() {
        String s = "Fahrrad";
        String s2 = "fahrrad";
        if (s.equalsIgnoreCase(s2)) {
            System.out.println("gleich");
        } else {
            System.out.println("nicht gleich");
        }
    }

    public static void testIgnoreCase2() {
        String s = "FahRrad";
        String s2 = "fahrraD";

        if (s.toLowerCase().equals(s2.toLowerCase())) {
            System.out.println("gleich");
        } else {
            System.out.println("nicht gleich");
        }
    }

    public static void testIgnoreCase3() {
        String s = "FahRrad";
        String s2 = "fahrraD";

        if (s.toUpperCase().equals(s2.toUpperCase())) {
            System.out.println("gleich");
        } else {
            System.out.println("nicht gleich");
        }
    }

    public static void testIgnoreCase4() {
        String s = "Fahrrad";
        String s2 = "fahrrad";

        char[] s1CharArray = s.toCharArray();
        char[] s2CharArray = s2.toCharArray();

        if (s1CharArray.length != s2CharArray.length) {
            System.out.println("nicht gleich");
            return;
        }

        for (int i = 0; i < s1CharArray.length; i++) {
            if (Character.toLowerCase(s1CharArray[i]) != Character.toLowerCase(s2CharArray[i])) {
                System.out.println("nicht gleich");
                return;
            }
        }

        System.out.println("gleich");
    }
}
