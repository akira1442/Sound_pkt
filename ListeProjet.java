import java.util.ArrayList;

public class ListeProjet {

    // Var d'instance

    private final String nom;
    private ArrayList<Projet> ListProjet;

    // Var de Classe

    private static int nbProjet = 0;


    // Constructeurs

    public ListeProjet(String nom){
        
        this.ListProjet = new ArrayList<>();
        this.nom = nom;
    }

    public ListeProjet(){

        this.ListProjet = new ArrayList<>();
        this.nom = "List_Album";
    }

    // Methodes

    public Projet getElement(String nomAlbum, String nomArtiste){

        for (Projet e : this.ListProjet){
            if ((e.getNom() == nomAlbum) && (e.getArtiste() == nomArtiste)){
                return e;
            }
        }

        System.out.println("Album not in lists");
        return null;
    }

    // Accesseurs

    public String getNom() {
        return nom;
    }
}