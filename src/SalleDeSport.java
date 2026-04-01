import java.util.ArrayList;
import java.util.List;


public class SalleDeSport {

        // Liste de tous les adhérents de la salle
        private List<Adherent> adherents = new ArrayList<>();
        // Liste de toutes les séances proposées
        private List<Seance> seances = new ArrayList<>();

        // Ajoute un adhérent à la salle
        public void ajouterAdherent(Adherent a) {
            adherents.add(a);
        }

        // Ajoute une séance à la salle
        public void ajouterSeance(Seance s) {
            seances.add(s);
        }

        // Retourne toutes les séances disponibles
        public List<Seance> seancesDisponibles() {
            return seances;
        }


        public List<Adherent> adherentsAvecSauna() {

            // Liste pour stocker les adhérents qui ont le droit au sauna
            List<Adherent> result = new ArrayList<>();

            // Parcourt tous les adhérents
            for (Adherent a : adherents) {
                // Vérifie si leur abonnement permet l'accès au sauna
                if (a.getAbonnements().permetAccesSauna()) {
                    result.add(a); // Ajoute l'adhérent à la liste
                }
            }
            return result;
        }


        public double chiffreAffairesPrestations() {
            double total = 0;

            // Parcourt tous les adhérents
            for (Adherent a : adherents) {
                total += a.depensesTotales(); // Ajoute leurs dépenses
            }

            return total;
        }

        // Cherche un adhérent par son id, sinon lance une exception
        public Adherent trouverAdherent(int id) {

            for (Adherent a : adherents) {
                if (a.getId() == id) {
                    return a; // Retourne l'adhérent trouvé
                }
            }
            throw new IllegalArgumentException("Adhérent introuvable avec id: " + id);
        }
    }

