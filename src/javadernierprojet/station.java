package javadernierprojet;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
public class station {
    private String nom;
    private ArrayList<Velo> inventaire;

    public station(String nom) {
        this.nom = nom;
        this.inventaire = new ArrayList<>();
    }

    public void ajoutervelo(Velo v) {
        inventaire.add(v);
    }

    public void afficherEtatStation() {
        System.out.println("\n--- Etat de la station : " + nom + " ---");
        for (Velo v : inventaire) {
            v.afficherInfos();
        }
    }
}
