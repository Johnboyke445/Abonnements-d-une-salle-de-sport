import java.util.ArrayList;
import java.util.List;

public class Adherent {

    private int id;
    private String nom;
    private Abonnement abonnements;
    private List<Reservation> reservations;

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

    public List<Reservation> ReservationsFutures(){
    return null;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public  Abonnement getAbonnements() {
        return abonnements;
    }

    public String toString() {
        return  " Num : " + getId() + " Nom : " + getNom() + " Abonnement : " + getAbonnements() + " Réservation : " + ReservationsFutures();
    }



}
