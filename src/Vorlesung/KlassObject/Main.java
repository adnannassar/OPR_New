package Vorlesung.KlassObject;

public class Main {


    public static void main(String[] args) {
        String str1 = "shahd";
        String str2 = "shahd";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Student s1 = new Student("Shahd", 25);
        Student s2 = new Student("Shahd", 25);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(str1.equals(str2));
        System.out.println(s1.equals(s2));


        System.out.println(s1);
        System.out.println(s2);
    }

}

