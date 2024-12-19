import java.util.Scanner;

public class NombresParfaits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Saisie de n par l'utilisateur
            System.out.print("Entrez le nombre de nombres parfaits à afficher : ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Veuillez entrer un nombre positif.");
                return;
            }

            System.out.println("Les " + n + " premiers nombres parfaits sont :");
            int count = 0;
            int num = 1;

            // Recherche des n premiers nombres parfaits
            while (count < n) {
                if (estNombreParfait(num)) {
                    System.out.println(num);
                    count++;
                }
                num++;
            }

        } catch (Exception e) {
            System.out.println("Erreur : Veuillez entrer un entier valide.");
        } finally {
            scanner.close();
        }