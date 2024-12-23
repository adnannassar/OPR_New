package Klausuren.Januar_2024.Aufgabe_008.OOP;

public class Main {
    public static void main(String[] args) {
        OnlineBanking onlineBanking = new OnlineBanking();


        onlineBanking.setzePINregel(new MeinRegel());
        onlineBanking.setzePINregel(new NegativeRegel());
    }
}
