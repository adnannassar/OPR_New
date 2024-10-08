package Wiederholung.Swtich;

public class Switch {
    public static void main(String[] args) {
        int n = 10;
        /*
        if (n > 0) {
            System.out.println("Großer null");
        } else if ( n == 0) {
            System.out.println("Gleich null");
        }
        else {
            System.out.println("Kleiner null");
        }
        #
         */

        switch (n) {
            case 0:
                System.out.println("Gleich null");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("FEHLER!");
        }


    }
}
