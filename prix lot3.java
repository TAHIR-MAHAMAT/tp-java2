import java.util.Random;

public class PrixLot3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalEssais = 0;
        int parties = 20;

        for (int partie = 1; partie <= parties; partie++) {
            int prix = rand.nextInt(1001); // Prix aléatoire entre 0 et 1000
            int bas = 0, haut = 1000;
            int essais = 0;
            int proposition;

            while (true) {
                proposition = (bas + haut) / 2; // Stratégie de division
                essais++;

                if (proposition > prix) {
                    haut = proposition - 1;
                } else if (proposition < prix) {
                    bas = proposition + 1;
                } else {
                    break; // Prix trouvé
                }
            }

            System.out.println("Partie " + partie + " : Trouvé en " + essais + " essai(s).");
            totalEssais += essais;
        }

        double moyenne = (double) totalEssais / parties;
        System.out.printf("Moyenne des essais sur %d parties : %.2f\n", parties, moyenne);
    }
}