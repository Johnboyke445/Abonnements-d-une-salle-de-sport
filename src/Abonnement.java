import java.time.LocalDate;

public abstract class Abonnement {

    private String reference;
    private LocalDate dateDebut;
    private int dureeMois;
    private double prixMensuel;

    public  Abonnement() {
        this.reference = "";
        this.dateDebut = null;
        this.dureeMois = 0;
        this.prixMensuel = 0;
    }

    public Abonnement(String reference, LocalDate dateDebut, int dureeMois, double prixMensuel) {
        this.reference = reference;
        this.dateDebut = dateDebut;
        this.dureeMois = dureeMois;
        this.prixMensuel = prixMensuel;
    }

    public LocalDate dateFin(){
        return dateDebut.plusMonths(dureeMois);
    }

    public double coutTotal(){
        return this.prixMensuel * this.dureeMois;
    }

    public abstract boolean permetAccesSauna();
    public abstract int creditsCoachInclus();

    public String toString() {
        return  "Abonnement : " + this.reference + " début : " + this.dateDebut + " Fin : " + this.dateFin() + " Durée : " + this.dureeMois + " mois" + " prixMensuel : " + this.prixMensuel + "€" + " prix total : " + this.coutTotal() + "€";
    }
}
