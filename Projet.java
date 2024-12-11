public class Projet {
    
    // Var d'instances

    private final String nom;
    private final String artiste;
    private final String date;            // Format: dd/mm/yyyy
    private final String lien;
    private final int type;

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

    public boolean equal(Object obj){

        if (this == obj){
            return true;
        }
        if (obj instanceof Projet){
            Projet p = (Projet)obj;
            return (this.nom == p.nom) && (this.artiste == p.artiste) && (this.date == p.date) && (this.type == p.type);
        }
        return false;
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
