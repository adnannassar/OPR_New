package Vorlesung.HuellenKlassen.String;

public class Main {
    public static void main(String[] args) {

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
}
