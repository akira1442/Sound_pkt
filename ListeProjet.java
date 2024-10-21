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

        System.out.println("Album not in lists");
        return null;
    }

    public Projet getProjet(int index){

        return this.ListProjet.get(index);
    }

    public void addProjetHead(Projet p){

        /*Ajout en tête de la liste*/

        this.ListProjet.add(p);
        nbProjet++;
        System.out.println("Project: %s added".formatted(p.toString()));
    }

    public void suppProjetHead(Projet p){

        /*Supprime en tête de la liste*/

        if (this.ListProjet.remove(p)){
            nbProjet--;
            System.out.println("Project: %s deleted".formatted(p.toString()));
            return;
        }
        System.out.println("Project: %s not in list".formatted(p.toString()));
    }

    public void addProjetTail(Projet p){

        /*Ajout en queue de la liste*/

        this.ListProjet.add(nbProjet,p);
        nbProjet++;
        System.out.println("Project: %s added".formatted(p.toString()));
    }

    public void suppProjetTail(Projet p){

        /*Supprime en queue de la liste*/

        if (this.ListProjet.remove(p)){
            nbProjet--;
            System.out.println("Project: %s deleted".formatted(p.toString()));
        }
        System.out.println("Project: %s not in list".formatted(p.toString()));
    }

    public void addProjetIndex(Projet p, int i){

        /*Ajout le projet à l'indice i*/

        this.ListProjet.add(i,p);
        nbProjet++;
        System.out.println("Project: %s added".formatted(p.toString()));
    }

    public void suppProjetIndex(int i){

        /*Supprime le projet à l'indice i*/

        Projet supp = this.ListProjet.get(i);

        if (this.ListProjet.remove(supp)){
            nbProjet--;
            System.out.println("Project: deleted");
        }
        System.out.println("Project not in list");
    }

    // Accesseurs

    public String getNom() {
        return nom;
    }
}