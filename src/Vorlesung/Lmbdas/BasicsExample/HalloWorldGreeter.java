package Vorlesung.Lmbdas.BasicsExample;

public class HalloWorldGreeter implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello world");
    }
}
