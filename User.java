import java.util.ArrayList;

public class User {

    // Var d'instances

    private final String userName;
    private ArrayList<ListeProjet> Data;

    // Var de classe

    private static int nbListe = 0;

    // Constructeurs

    public User(String userName) {

        this.userName = userName;
        this.Data = new ArrayList<>();
    }

    // Methodes

    public void addListe(ListeProjet lp){

        if (this.inData(lp.getNom())){
            
        }
        Data.add(lp);
        nbListe++;
    }

    public ListeProjet inData(ListeProjet lp){

        for (ListeProjet l : this.Data){
            if (l.getNom() == lp.getNom()){
                return l;
            }
        }
        return null;
    }

    public boolean inData(String nom){
        
        for (ListeProjet l : this.Data){
            if (l.getNom() == nom){
                return true;
            }
        }
        return false;
    }

    // Methodes de classe

    public static int getNbListe() {

        return nbListe;
    }

    // Methodes Override

    @Override
    public String toString(){

        String s = "Username: " + this.userName + "\n";

        for (ListeProjet lp : Data){
            s += lp.toString() + "\n";
        }

        return s;
    }

    // Accesseur

    public String getUserName() {

        return userName;
    }
}
