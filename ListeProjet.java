import java.util.ArrayList;

public class ListeProjet {

    // Var d'instance

    private ArrayList<Projet> ToListened;
    private ArrayList<Projet> Listened;

    // Var de Classe

    private static int nbToListened = 0;
    private static int nbListened = 0;
    private static int nbProjet = 0;

    // Constructeurs

    public ListeProjet(){
        
        this.ToListened = new ArrayList<>();
        this.Listened = new ArrayList<>();
    }

    // Methodes

    public Projet getElement(String nomAlbum, String nomArtiste){

        for (Projet e : this.ToListened){
            if ((e.getNom() == nomAlbum) && (e.getArtiste() == nomArtiste)){
                return e;
            }
        }

        for (Projet e : this.Listened){
            if ((e.getNom() == nomAlbum) && (e.getArtiste() == nomArtiste)){
                return e;
            }
        }
        System.out.println("Album not in lists");
        return null;
    }
}