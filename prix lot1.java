import java.util.Scanner;

public class PrixLot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prix = (int) (Math.random() * 1001); // Prix aléatoire entre 0 et 1000
        int essais = 0;
        int proposition;

        System.out.println("Devinez un prix entre 0 et 1000");

        do {
            System.out.print("Tapez un prix : ");
            proposition = scanner.nextInt();
            essais++;

            if (proposition > prix) {
                System.out.println("Trop grand !");
            } else if (proposition < prix) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("BRAVO ! Vous avez trouvé en " + essais + " essai(s).");
            }
        } while (proposition != prix);

        scanner.close();
    }
}