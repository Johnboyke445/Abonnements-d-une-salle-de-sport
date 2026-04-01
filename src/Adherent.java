import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Adherent {

    private int id;
    private String nom;
    private Abonnement abonnements;
    private List<Reservation> reservations = new ArrayList<>();

    public Adherent(int id, String nom, Abonnement abonnements) {
        this.id = id;
        this.nom = nom;
        this.abonnements = abonnements;
        this.reservations = new ArrayList<>();
    }

    public void reserver(Seance s){
        Reservation r = new Reservation(s);
        reservations.add(r);
    }

    public double depensesTotales(){
     double total = 0;
     for(Reservation r : reservations){
         total += r.coutPrestations();
     }
     return total;
    }

    public List<Reservation> ReservationsFutures() {
        List<Reservation> futures = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now(); // Récupère la date et l'heure actuelle

        for (Reservation r : reservations) {
            if (r.getSeance() != null && r.getSeance().getDateHeure().isAfter(now)) { // Vérifie que la séance existe et que la date de la séance est après maintenant
                futures.add(r);
            }
        }
        return futures;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public  Abonnement getAbonnements() {
        return abonnements;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public String toString() {
        return  " Num : " + getId() + " Nom : " + getNom() + " / Type : " + getAbonnements() + " Réservation : " + ReservationsFutures();
    }



}
