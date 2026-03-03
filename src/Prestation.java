public class Prestation {

    private String code;
    private String libelle;
    private double prix;

    //Constructeur par default
    public Prestation(){
       this.code = "";
       this.libelle = "";
       this.prix = 0;
    }

    //Constructeur paramétré
    public Prestation(String code, String libelle, double prix) {
        this.code = code;
        this.libelle = libelle;
        this.prix = prix;
    }

    //Getter
    public String getCode(){
        return this.code;
    }
    //Setter
    public void setCode(String code){
        this.code = code;
    }

    public String getLibelle(){
        return this.libelle;
    }

    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    public double getPrix(){
        return this.prix;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }
}
