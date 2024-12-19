import java.util.Scanner;

public class PGCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Saisie des deux nombres
            System.out.println("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();

            System.out.println("Entrez le deuxième nombre : ");
            int nombre2 = scanner.nextInt();

            // Calcul du PGCD avec l'algorithme d'Euclide
            int pgcd = calculerPGCD(nombre1, nombre2);

            // Affichage du résultat
            System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);
        } catch (Exception e) {
            System.out.println("Erreur : veuillez entrer des entiers valides.");
        } finally {
            scanner.close();
        }
    }

    /**
     * Méthode pour calculer le PGCD en utilisant l'algorithme d'Euclide.
     *
     * @param a Premier nombre
     * @param b Deuxième nombre
     * @return Le PGCD de a et b
     */
    public static int calculerPGCD(int a, int b) {
        // Algorithme d'Euclide
        while (b != 0) {
            int reste = a % b;
            a = b;
            b = reste;
        }
        return Math.abs(a); // Retourne le PGCD (en valeur absolue)
    }
