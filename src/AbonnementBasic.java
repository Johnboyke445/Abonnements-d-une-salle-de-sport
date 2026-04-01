import java.time.LocalDate;

public class AbonnementBasic extends Abonnement {

    public AbonnementBasic(String ref, LocalDate debut, int duree) {
        super(ref, debut, duree, 30.0);
    }

    @Override
    public boolean permetAccesSauna() {
        return false;
    }

    @Override
    public int creditsCoachInclus() {
        return 0;
    }

    @Override
    public String toString() {
        return " [BASIC] " + super.toString();
    }
}

