package Vorlesung.Lmbdas.BasicsExample;

import java.util.Comparator;

public class Greeter {


    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        HalloWorldGreeter halloWorldGreeter = new HalloWorldGreeter(); // OOP way

        Greeting ciaoCode = () -> System.out.println("Ciao"); // functional programming way

        greeter.greet(halloWorldGreeter);
        greeter.greet(ciaoCode);
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
