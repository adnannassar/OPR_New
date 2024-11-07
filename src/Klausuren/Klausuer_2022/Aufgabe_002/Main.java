package Klausuren.Klausuer_2022.Aufgabe_002;

public class Main {
    public static void main(String[] args) {
        Zutat mehl = new Zutat("Mehl", true);
        Zutat tomaten = new Zutat("Tomaten", true);
        Zutat sosse = new Zutat("Sosse", false);

        Zutat[] pizzaZutaten = {mehl, tomaten, sosse};

        Lebensmittel pizza = new Pizza(pizzaZutaten);

        System.out.println(pizza.zutatentext());
        if(pizza.istVegan()) {
            System.out.println("Pizza ist Vegan");
        } else {
            System.out.println("Pizza ist nicht Vegan");
        }


        Zutat milch = new Zutat("Milch", true);

        Zutat[] milchZutaten = {milch};
        Lebensmittel milchProdukt = new Milch(milchZutaten);

        System.out.println(milchProdukt.zutatentext());
        if(milchProdukt.istVegan()) {
            System.out.println("Milchprodukt ist Vegan");
        } else {
            System.out.println("Milchprodukt ist nicht Vegan");
        }
    }
}
