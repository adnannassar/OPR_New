package Klausuren.Januar_2024.Aufgabe_008.Lamba;

public class Main {
    public static void main(String[] args) {
        OnlineBanking onlineBank = null;
        try {
            onlineBank = new OnlineBanking(pin -> pin.length() >= 5, "123123");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(onlineBank);
        }

        onlineBank.setzePINregel(pin -> pin.length() >= 3);
        onlineBank.setPin("123");
        System.out.println("After the new Regel!: ");
        System.out.println(onlineBank);



        // onlineBanking.setzePINregel(pin -> pin.length() >= 5 && pin.charAt(0) != pin.charAt(pin.length() - 1));
        // onlineBanking.setzePINregel(pin -> false);
    }
}
