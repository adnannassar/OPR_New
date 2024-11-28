package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClassExample {
    public static void main(String[] args) {

        System.out.println("\nStreams of Students with map");
        Optional<Student> studentOptional = Stream
                .of(
                        new Student("Shaker", 20),
                        new Student("Amani", 21),
                        new Student("Omar", 22))
                .filter(n -> n.name.toLowerCase().startsWith("a"))
                .min(Comparator.comparingInt(s -> s.age));

        if (studentOptional.isPresent()) {
            System.out.println(studentOptional.get().name);
        } else {
            System.out.println("No student found");
        }

    }
}
