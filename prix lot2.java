import java.util.Scanner;

public class PrixLot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char rejouer;

        do {
            int prix = (int) (Math.random() * 1001);
            int essais = 0, maxEssais;
            boolean trouve = false;

            System.out.print("Entrez le nombre maximum d'essais : ");
            maxEssais = scanner.nextInt();

            System.out.println("Devinez un prix entre 0 et 1000");

            while (essais < maxEssais) {
                System.out.print("Tapez un prix : ");
                int proposition = scanner.nextInt();
                essais++;

                if (proposition > prix) {
                    System.out.println("Trop grand !");
                } else if (proposition < prix) {
                    System.out.println("Trop petit !");
                } else {
                    System.out.println("BRAVO ! Vous avez trouvé en " + essais + " essai(s).");
                    trouve = true;
                    break;
                }
            }

            if (!trouve) {
                System.out.println("PERDU ! Le prix était : " + prix);
            }

            System.out.print("Voulez-vous rejouer (O/N) ? ");
            rejouer = scanner.next().charAt(0);

        } while (rejouer == 'O' || rejouer == 'o');

        scanner.close();
    }
}