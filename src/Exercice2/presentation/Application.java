package Exercice2.presentation;

import Exercice2.metier.MetierProduitImpl;
import Exercice2.metier.Produit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metierProduit = new MetierProduitImpl(new ArrayList());
        metierProduit.add(new Produit(1, "p1", 11000.0, 11.0));
        metierProduit.add(new Produit(2, "p2", 12000.0, 12.0));
        metierProduit.add(new Produit(3, "p3", 13000.0, 13.0));
        metierProduit.delete(3L);
        List<Produit> produits = metierProduit.getAll();
        Iterator var4 = produits.iterator();

        while(var4.hasNext()) {
            Produit produit = (Produit)var4.next();
            System.out.println(produit);
        }
    }
}
