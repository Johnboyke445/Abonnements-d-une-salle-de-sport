import java.time.LocalDateTime;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        // Création des prestations
        Prestation sauna = new Prestation("SAUNA", "Accès sauna", 5);
        Prestation coach = new Prestation("COACH", "Séance coach", 25);
        Prestation serviette = new Prestation("SERVIETTE", "Location serviette", 2);

        // Création des séances
        Seance seance1 = new Seance(1, "BodyPump", LocalDateTime.of(2026, 7, 5, 18, 0),10);
        Seance seance2 = new Seance(2, "Yoga", LocalDateTime.of(2026, 6, 6, 9, 30), 15);
        Seance seance3 = new Seance(3, "Boxe", LocalDateTime.of(2026, 5, 7, 19, 0), 20);

        // Création des abonnements
        Abonnement Basic = new AbonnementBasic("B001", LocalDate.of(2026, 3, 1), 12);
        Abonnement Premium = new AbonnementPremium("B002", LocalDate.of(2026, 3, 2), 5);

        // Création des adhérents
        Adherent adherent1 = new Adherent(1, " Alice", Basic);
        Adherent adherent2 = new Adherent(2, "Bob", Premium);


        // Création de la salle de sport
        SalleDeSport salle = new SalleDeSport();
        salle.ajouterAdherent(adherent1);
        salle.ajouterAdherent(adherent2);
        salle.ajouterSeance(seance1);
        salle.ajouterSeance(seance2);
        salle.ajouterSeance(seance3);

        // Réservations et prestations
        // Adhérent 1 (Basic) réserve BodyPump
        adherent1.reserver(seance1);
        adherent1.getReservations().get(0).ajouterPrestation(sauna);

        // Adhérent 2 (Premium) réserve Yoga et Boxe
        adherent2.reserver(seance2);
        adherent2.getReservations().get(0).ajouterPrestation(coach);
        adherent2.getReservations().get(0).ajouterPrestation(serviette);

        adherent2.reserver(seance3);
        adherent2.getReservations().get(1).ajouterPrestation(sauna);

        // Annuler une réservation (exemple : adhérent2 annule la Boxe)
        adherent2.getReservations().get(1).annuler();


        // Affichage des adhérents et abonnements
        System.out.println("---- Adhérents ----");
        System.out.println(adherent1);
        System.out.println(adherent2);

        // Affichage des réservations futures pour un adhérent
        System.out.println("\n---- Réservations futures de Bob ----");
        for (Reservation r : adherent2.ReservationsFutures()) {
            System.out.println(r);
        }

        // Liste des adhérents ayant accès sauna
        System.out.println("\n---- Adhérents avec accès sauna ----");
        for (Adherent a : salle.adherentsAvecSauna()) {
            System.out.println(a.getId() + " - " + a.getNom());
        }

        // Chiffre d’affaires des prestations
        System.out.println("\nChiffre d'affaires prestations: " + salle.chiffreAffairesPrestations() + "€");
    }
}