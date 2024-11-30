package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.Arrays;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(Stream.of("Java", "Python", "Html" , "C")
                                .map(name -> name.length())
                                .reduce(0, (a, b) -> a + b));


        double array []  =  {1,2,3,4};
        System.out.println(Arrays.stream(array).reduce(Double::sum).getAsDouble());
    }
}
