import java.util.Scanner;

public class SchereSteinPapier {
    static String[] zeichen = {"Schere", "Stein", "Papier"};

    public static void main(String[] args) {
        for(String s : zeichen) {
            System.out.println(s);
        }

        checkWinner();
    }

    public static String randomCpuCharacter() {
        int zufall = (int) ((Math.random() * 3));

        return zeichen[zufall];
    }

    public static String readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Schere, Stein oder Papier eingeben: ");
        return sc.next();
    }

    public static void checkWinner() {
        String erg = randomCpuCharacter();
        String input = readUserInput();

        //Unentschieden Situation
        if(erg.equals(input)) {
            System.out.println("-------");
            System.out.println(erg);
            System.out.println("♦♦♦♦Unentschieden♦♦♦♦");
        } else {

            //prüft Gewinner
            boolean cpuGewinnt = (erg.equals("Schere") && input.equals("Papier")) || (erg.equals("Papier") && input.equals("Stein") || (erg.equals("Stein") && input.equals("Schere")));
            boolean playerGewinnt = (input.equals("Schere") && erg.equals("Papier")) || (input.equals("Papier") && erg.equals("Stein") || (input.equals("Stein") && erg.equals("Schere")));

            if(cpuGewinnt) {
                System.out.println(erg);
                System.out.println("--------");
                System.out.println("Verloren");
            }

            //Player gewinnt
            else if(playerGewinnt) {
                System.out.println(erg);
                System.out.println("--------");
                System.out.println("Gewonnen");
            }
        }
    }
}
