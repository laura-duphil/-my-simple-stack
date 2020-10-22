package deqo.ladu.mysimplestack;

public class Item {
    String nom;

    public Item(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString(){
        return "Item{" + "objet :" + nom + "}";
    }
}
