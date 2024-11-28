package Wiederholung.Regex;

public class RegEx {

    public static void main(String[] args) {
        // write regex that accept only 5 digits
        String regex2 = "\\d[0-9]*";
        System.out.println("11019129837612983789123".matches(regex2)); // true
    }
}
