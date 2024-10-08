package Wiederholung.Loops;

public class While {
    public static void main(String[] args) {
        System.out.print("For: ");
        for (int i = 10; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nWhile: ");
        int i = 10;
        while (i <= 5){
            System.out.print(i + " ");
            i++;
        }

        System.out.print("\nDo While: ");
        int j = 10;
        do{
            System.out.print(j + " ");
            j++;
        }while (j <= 5);
    }
}
