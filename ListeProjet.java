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

    public Projet getProjet(String nomAlbum, String nomArtiste){

        for (Projet e : this.ListProjet){
            if ((e.getNom() == nomAlbum) && (e.getArtiste() == nomArtiste)){
                return e;
            }
        }
        System.out.println("Album not in lists"); // Exception
        return null;
    }

    public Projet getProjet(int index) throws ProjetNullException, IndexOutOfBoundsException{

        Projet p = this.ListProjet.get(index);

        if (index > this.ListProjet.size()){
            throw new IndexOutOfBoundsException("Index superieur a la taille de la liste"); 
        }
        else if (p == null){
            throw new ProjetNullException("Projet non initialise");
        }

        return p;
    }

    public void addProjet(Projet p){

        this.ListProjet.add(p);
        nbProjet++;
        System.out.println("Project: %s added".formatted(p.toString()));
    }

    public void addProjetIndex(Projet p, int i) throws IndexOutOfBoundsException{

        /*Ajoute le projet à l'indice i*/

        if (i > this.ListProjet.size()){
            throw new IndexOutOfBoundsException("Index superieur a la taille de la liste");
        }

        this.ListProjet.add(i,p);
        nbProjet++;
        System.out.println("Project: %s added".formatted(p.toString()));
    }

    public void suppProjet(Projet p) throws ProjetNullException, NotInListeExeption{

        if (p == null){
            throw new ProjetNullException("Projet non initialise");
        }else if (this.ListProjet.remove(p)){
            nbProjet--;
            System.out.println("Project: %s deleted".formatted(p.toString()));
        }else{
            System.out.println("Project: %s not in list".formatted(p.toString()));
            throw new NotInListeExeption("Projet %s n'est pas dans la liste".formatted(p.toString()));
        }
    }

    public void suppProjet(String nomAlbum, String nomArtist) throws NotInListeExeption, ProjetNullException{

        Projet p = this.getProjet(nomAlbum, nomArtist);

        if (p == null){
            throw new ProjetNullException("Projet non initialise");
        }if (this.ListProjet.remove(p)){
            nbProjet--;
            System.out.println("Project: %s bt %s deleted".formatted(nomAlbum, nomArtist));
        }else{
            System.out.println("Project: %s not in list".formatted(p.toString()));
            throw new NotInListeExeption("Projet %s n'est pas dans la liste".formatted(p.toString()));
        }
    }

    public void suppProjetIndex(int i){

        /*Supprime le projet à l'indice i*/

        Projet supp = this.ListProjet.get(i);

        if (this.ListProjet.remove(supp)){
            nbProjet--;
            System.out.println("Project deleted");
        }else {
            // Exception out of bounds
            System.out.println("Project not in list");
        }
    }

    // Methodes Override

    @Override
    public String toString(){

        String s = "";

        for (Projet p : this.ListProjet){
            s += p.toString() + "\n";
        }

        return s;
    }

    // Accesseurs

    public String getNom() {
        return nom;
    }

    public static int getNbProjet(){
        return nbProjet;
    }
}