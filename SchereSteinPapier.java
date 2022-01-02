import java.util.Scanner;

public class SchereSteinPapier {
    public static void main(String[] args) {
        String[] zeichen = {"", "Schere", "Stein", "Papier"};

        for(String s : zeichen) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println(randomCpuCharacter(zeichen));
        System.out.println(checkWinner(zeichen));

    }

    public static String randomCpuCharacter(String[] zeichen) {
        int zufall = (int) ((Math.random() * 3) + 1);

        if(zufall == 1) return "Schere";
        else if(zufall == 2) return "Stein";
        else if(zufall == 3) return "Papier";
        return "";
    }

    public static String readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Schere, Stein oder Papier eingeben: ");
        return sc.next();
    }

    public static String checkWinner(String[] zeichen) {

        //Unentschieden Situation
        if(randomCpuCharacter(zeichen).equals("Schere")) {
            if(readUserInput().equals("Schere")) {
                System.out.println("-------");
                return "♦♦♦♦Unentschieden♦♦♦♦";
            }
        } else if(randomCpuCharacter(zeichen).equals("Stein")) {
            if(readUserInput().equals("Stein")) {
                System.out.println("-------");
                return "♦♦♦♦Unentschieden♦♦♦♦";
            }
        } else if(randomCpuCharacter(zeichen).equals("Papier")) {
            if(readUserInput().equals("Papier")) {
                System.out.println("-------");
                return "♦♦♦♦Unentschieden♦♦♦♦";
            }
        }
//        //CPU gewinnt
//        else if (randomCpuCharacter.equals("Schere") && readUserInput.equals("Papier")) {
//            System.out.println("-------");
//            return "CPU hat gewonnen";
//        } else if (randomCpuCharacter.equals("Papier") && readUserInput.equals("Stein")) {
//            System.out.println("-------");
//            return "CPU hat gewonnen";
//        } else if (randomCpuCharacter.equals("Stein") && readUserInput.equals("Schere")) {
//            System.out.println("-------");
//            return "CPU hat gewonnen";
//        }
//
//        //Spieler gewinnt
//        else if (readUserInput.equals("Schere") && randomCpuCharacter.equals("Papier")) {
//            System.out.println("-------");
//            return "Spieler hat gewonnen";
//        } else if (readUserInput.equals("Papier") && randomCpuCharacter.equals("Stein")) {
//            System.out.println("-------");
//            return "Spieler hat gewonnen";
//        } else if (readUserInput.equals("Stein") && randomCpuCharacter.equals("Schere")) {
//            System.out.println("-------");
//            return "Spieler hat gewonnen";
//        }

        return "";
    }
}
