import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NombreJoursEntreDates {

    // Méthode pour lire et valider une date
    private static LocalDate lireDate(Scanner scanner) {
        while (true) {
            try {
                String dateStr = scanner.nextLine();
                return LocalDate.parse(dateStr);
            } catch (Exception e) {
                System.out.println("Format invalide. Veuillez entrer la date au format YYYY-MM-DD : ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Saisie de la première date
            System.out.println("Entrez la première date (format YYYY-MM-DD) :2024-06-01 ");
            LocalDate date1 = lireDate(scanner);

            // Saisie de la deuxième date
            System.out.println("Entrez la deuxième date (format YYYY-MM-DD) :2024-01-01 ");
            LocalDate date2 = lireDate(scanner);

            // Calcul du nombre de jours entre les deux dates
            long nombreJours = ChronoUnit.DAYS.between(date1, date2);

            // Affichage du résultat
            if (nombreJours == 0) {
                System.out.println("Les deux dates sont identiques. Il y a 0 jour entre elles.");
            } else if (nombreJours < 0) {
                System.out.println("La deuxième date est antérieure à la première. Nombre de jours : " + Math.abs(nombreJours) + " jour(s).");
            } else {
                System.out.println("Le nombre de jours entre " + date1 + " et " + date2 + " est : " + nombreJours + " jour(s).");
            }

        } catch (Exception e) {
            System.out.println("Une erreur inattendue est survenue.");
        } finally {
            scanner.close();
        }
    }
