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

    public void addListeHead(ListeProjet lp){

        Data.add(lp);
    }

    public void addListeTail(ListeProjet lp){

        Data.add(lp);
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
