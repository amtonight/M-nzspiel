import java.util.Scanner;

public class Muenzspiel {

    // Rechner Zieht
    static int rechner_zieht (int m) {
        if (m % 4 == 0) {
            System.out.println("Rechner nimmt eine Münze");
            return 1; // auf jeden Fall verloren, wenn Mensch richtig spielt.

        }
        System.out.println("Rechner nimmt " +m%4 + " Münze");
        return m % 4;
    }
    static int mensch_zieht (int m){

        Scanner in = new Scanner(System.in);
        int muenzen = in.nextInt();
        System.out.println("Mensch nimmt " + muenzen + " Münzen");
        return muenzen;
    }

    public static void main(String[] args) {


        System.out.println("SPIELANFANG");

        System.out.println("Bitte geben Sie eine Münzanzahl ein:");

        Scanner scanner = new Scanner (System.in);

        int muenzen = scanner.nextInt();

        System.out.println("Wir spielen mit " + muenzen + " Muenzen");


        while (true){

           muenzen -= rechner_zieht(muenzen); //muenzen = muenzen - rechner_zieht
            System.out.println("Aktuell liegen " + muenzen + " Münzen auf dem Tisch");

            if(muenzen <=0){
                System.out.println("RECHNER GEWINNT");
                break;
            }

            muenzen -= mensch_zieht(muenzen); //muenzen = muenzen - rechner_zieht
            System.out.println("Aktuell liegen " + muenzen + " Münzen auf dem Tisch");

            if(muenzen <=0) {
                System.out.println("MENSCH GEWINNT");
                break;
            }
        }
    }
}
