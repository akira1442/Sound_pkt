public class Projet {
    
    // Var d'instances

    private String nom;
    private String artiste;
    private String date;            // Format: dd/mm/yyyy
    private String lien;
    private int type;

    // Var de Classe
    
    private static final String[] tabType = {"Album", "Mixtape", "Ep"};
    
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

    // Methodes overides

    @Override
    public String toString(){

        return "%s est un(e) %s %s %s %s".formatted(this.nom, tabType[this.type], this.artiste, this.date, this.lien);
    }

    public boolean equal(Projet p){
        // Exception not null
        return (this.nom == p.nom) && (this.artiste == p.artiste) && (this.date == p.date) && (this.type == p.type);
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
