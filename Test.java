public class Test {
    public static void main(String[] args) {

        Projet p1 = new Projet("Grünt 60", "Bu$hi", "28/09/2023", 1);
        Projet p2 = new Projet("24", "La Fêve", "22/12/2023", 0);
        Projet p3 = new Projet("Eternal Atake 2", "Lil Uzi Vert", "01/11/2024", 0);
        Projet p4 = p1;
        ListeProjet lp1 = new ListeProjet();
        ListeProjet lp2 = new ListeProjet();
        User u = new User("Akira");

        System.out.println(p1.equals(p4) ? "%s = %s".formatted(p1.toString(), p2.toString()) : "%s != %s".formatted(p1.toString(), p2.toString()));

        lp1.addProjet(p1);
        lp1.addProjet(p2);
        lp2.addProjet(p3);
        u.addListeHead(lp1);
        u.addListeTail(lp2);

        System.out.print(u.toString());
        lp1.suppProjetIndex(1);
        System.out.print(u.toString());
    }
}
