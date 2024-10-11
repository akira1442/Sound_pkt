public class Projet {
    
    // Var d'instances

    private String nom;
    private String artiste;
    private String date;            // Format: dd/mm/yyyy
    private String lien;
    private int type;
    
    // Constructeurs

    public Projet(String nom, String artiste, String date, String lien, int type){

        this.nom = nom;
        this.artiste = artiste;
        this.date = date;
        this.lien = lien;
        this.type = type;
    }

    public Projet(String nom, String artiste, String date,int type){

        this(nom, artiste, date, "", type);
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

    public int getType(){

        return this.type;
    }
}
