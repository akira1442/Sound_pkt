import java.util.ArrayList;

public class ListeProjet extends ArrayList<Projet>{

    // Var d'instance

    private final String nom;
    private int nbProjet;

    // Constructeurs

    public ListeProjet(String nom){
        
        this.nom = nom;
        this.nbProjet = 0;
    }

    public ListeProjet(){

        this("Liste_Projet");
    }

    public ListeProjet(ListeProjet lp){

        this.nom = lp.nom;
        this.nbProjet = lp.nbProjet;
    }

    // Methodes

    public Projet getProjet(String nomAlbum, String nomArtiste) throws NotInListeExeption{

        for (Projet e : this){
            if ((e.getNom() == nomAlbum) && (e.getArtiste() == nomArtiste)){
                return e;
            }
        }
        throw new NotInListeExeption("Album not in lists"); // Exception
    }

    public Projet getProjet(int index) throws ProjetNullException, IndexOutOfBoundsException{

        Projet p = this.get(index);

        if (index > this.size()){
            throw new IndexOutOfBoundsException("Index superieur a la taille de la liste"); 
        }
        else if (p == null){
            throw new ProjetNullException("Projet non initialise");
        }

        return p;
    }

    public void addProjet(Projet p){

        this.add(p);
        this.nbProjet++;
        System.out.println("Project: %s added".formatted(p.toString()));
    }

    public void addProjetIndex(Projet p, int i) throws IndexOutOfBoundsException{

        /*Ajoute le projet à l'indice i*/

        if (i > this.size()){
            throw new IndexOutOfBoundsException("Index superieur a la taille de la liste");
        }

        this.add(i,p);
        this.nbProjet++;
        System.out.println("Project: %s added".formatted(p.toString()));
    }

    public void suppProjet(Projet p) throws ProjetNullException, NotInListeExeption{

        if (p == null){
            throw new ProjetNullException("Projet non initialise");
        }else if (this.remove(p)){
            this.nbProjet--;
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
        }if (this.remove(p)){
            this.nbProjet--;
            System.out.println("Project: %s bt %s deleted".formatted(nomAlbum, nomArtist));
        }else{
            System.out.println("Project: %s not in list".formatted(p.toString()));
            throw new NotInListeExeption("Projet %s n'est pas dans la liste".formatted(p.toString()));
        }
    }

    public void suppProjetIndex(int i){

        /*Supprime le projet à l'indice i*/

        Projet supp = this.get(i);

        if (this.remove(supp)){
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

        for (Projet p : this){
            s += p.toString() + "\n";
        }

        return s + "Possède " + this.nbProjet + " projet(s)";
    }

    // Accesseurs

    public String getNom() {
        return nom;
    }

    public int getNbProjet(){
        return this.nbProjet;
    }
}