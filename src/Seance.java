import java.time.LocalDate;
import java.time.LocalDateTime;

public class Seance {

    private int id;
    private String nom;
    private LocalDateTime date;

    //Constructeur par default
    public Seance() {
        this.id = 0;
        this.nom= "";
        this.date= null;

    }

    //Constructeur paramétré
    public Seance(int id, String nom, LocalDateTime date) {
        this.id = id;
        this.nom = nom;
        this.date = date;
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
    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
