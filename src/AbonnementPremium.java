import java.time.LocalDate;

public class AbonnementPremium extends Abonnement{

    private int creditsCoach;

    public AbonnementPremium(String ref, LocalDate debut, int duree) {
        super(ref, debut, duree, 60.0);
        this.creditsCoach = creditsCoach;
    }

    @Override
    public boolean permetAccesSauna() {
        return true;
    }

    @Override
    public int creditsCoachInclus() {
        return creditsCoach;
    }

    @Override
    public String toString() {
        return " [PREMIUM] " + super.toString();
    }
}
