package Exercice2.metier;
public  class Produit {
    private int id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private double nbStock;

    public int getId() {
        return this.id;
    }

    public void setId(long l) {
        this.id = (int)l;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNbStock() {
        return this.nbStock;
    }

    public void setNbStock(double nbStock) {
        this.nbStock = nbStock;
    }

    public Produit(int id, String nom, String marque, double prix, String description, double nbStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbStock = nbStock;
    }

    public Produit(int id, String nom, double prix, double nbStock) {
        this.id = id;
        this.nom = nom;
        this.nbStock = nbStock;
        this.prix = prix;
    }

    public Produit() {
    }

    public String toString() {
        return "Produit [id=" + this.id + ", nom=" + this.nom + ", marque=" + this.marque + ", prix=" + this.prix + ", description=" + this.description + ", nbStock=" + this.nbStock + "]";
    }
}