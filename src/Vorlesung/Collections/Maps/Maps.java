package Vorlesung.Collections.Maps;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, Float> studentGrades = new HashMap<>();

        studentGrades.put("Aya", 1.3f);
        studentGrades.put("Adib", 1.7f);
        studentGrades.put("Sahd", 1.3f);

        System.out.println(studentGrades);

        System.out.println("Grade of Aya: " + studentGrades.get("Aya"));

        // contains key
        System.out.println("Is Sara in the map? " + studentGrades.containsKey("Sara"));

        // contains value
        System.out.println("Did anyone get 1.0? " + studentGrades.containsValue(1.0f));

        // values
        Collection<Float> grades = studentGrades.values();
        System.out.println("Grades: " + grades);

        // keySet
        Set<String> keys = studentGrades.keySet();
        System.out.println("Keys: " + keys);

        // iterator for map
        Set<String> keySet = studentGrades.keySet();
        Iterator<String> it = keySet.iterator();
        System.out.println("Print with iterator");
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " : " + studentGrades.get(key));
        }
    }
}
