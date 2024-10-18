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

    public String getUserName() {

        return userName;
    }

    // Methodes de classe

    public static int getNbListe() {

        return nbListe;
    }
}
