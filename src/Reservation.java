import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private Seance seance;
    private List<Prestation> prestations;
    private StatutReservation statut;

    //Constructeur par default
    public Reservation() {
        this.seance=null;
        this.prestations = new ArrayList<>();
        this.statut = StatutReservation.CONFIRMEE;
    }

    //Constructeur paramétré
    public Reservation(Seance seance) {
        this.seance = seance;
        this.prestations = new ArrayList<>();
        this.statut = StatutReservation.CONFIRMEE;
    }



    public void ajouterPrestation(Prestation p) {
        prestations.add(p); // ajoute l'objet Prestation à la liste
    }

    //Calcul le cout total
    public double coutPrestations(){
        double total = 0;
        for (Prestation p : this.prestations){
            total += p.getPrix();
        }
        return total;
    }

    public void annuler(){
        this.statut = StatutReservation.ANNULEE;
    }

    public String toString() {
        return "Reservation pour : " +  (seance != null ? seance.getNom() : "Aucune séance") + "  Statut : " + statut + "  Total prestations : " + coutPrestations() + "€";
    }

}
