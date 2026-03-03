public class AbonnementPrenium extends Abonnement{

    private int creditsCoach;

    @Override
    public boolean permetAccesSauna() {
        return true;
    }

    @Override
    public int creditsCoachInclus() {
        return creditsCoach;
    }
}
