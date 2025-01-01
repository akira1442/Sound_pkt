import java.util.ArrayList;

public class User {

    // Var d'instances

    private final String userName;
    private ArrayList<ListeProjet> Data;
    private int nbListe;

    // Constructeurs

    public User(String userName) {

        this.userName = userName;
        this.Data = new ArrayList<>();
        this.nbListe = 0;
    }

    // Methodes

    public void addListe(ListeProjet lp){

        try{
            this.inData(lp.getNom());
        }
        
        catch (NotInListeExeption e){
            this.addListe(lp);
            this.nbListe++;
        }
        

    }

    public ListeProjet inData(ListeProjet lp){

        for (ListeProjet l : this.Data){
            if (l.getNom() == lp.getNom()){
                return l;
            }
        }
        return null;
    }

    public boolean inData(String nom) throws NotInListeExeption{
        
        for (ListeProjet l : this.Data){
            if (l.getNom() == nom){
                return true;
            }
        }
        throw new NotInListeExeption(nom + " n'est pas dans la liste");
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

    public int getNbListe() {

        return this.nbListe;
    }
}
