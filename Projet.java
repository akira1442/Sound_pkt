public class Projet {
    
    // Var d'instances

    protected String nom;
    protected String artiste;
    protected String date;            // Format: dd/mm/yyyy
    protected String lien;

    // Constructeurs

    public Projet(String nom, String artiste, String date, String lien){

        this.nom = nom;
        this.artiste = artiste;
        this.date = date;
        this.lien = lien;
    }

    public Projet(String nom, String artiste, String date){

        this(nom, artiste, date, "");
    }

    // Methodes

    public String toString(){

        return "%s %s %s %s".formatted(this.nom, this.artiste, this.date, this.lien);
    }

    // Accesseurs

    public String getNom(){

        return this.nom;
    }

    public String getArtiste(){

        return this.artiste;
    }

    public String getDate(){

        return this.date;
    }

    public String getLien(){

        return this.lien;
    }
}
