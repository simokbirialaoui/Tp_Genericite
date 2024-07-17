package Exercice2.metier;
import java.util.Iterator;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit, Long> {
    private List<Produit> produits;

    public List<Produit> getProduits() {
        return this.produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public MetierProduitImpl(List<Produit> produits) {
        this.produits = produits;
    }

    public void add(Produit o) {
        this.produits.add(o);
    }

    public List<Produit> getAll() {
        return this.produits;
    }

    public Produit findById(Long id) {
        Iterator var3 = this.produits.iterator();

        while(var3.hasNext()) {
            Produit p = (Produit)var3.next();
            if ((long)p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    public void delete(Long id) {
        Produit produit = this.findById(id);
        if (produit != null) {
            this.produits.remove(produit);
        }

    }
}