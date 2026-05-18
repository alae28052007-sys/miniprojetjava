/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
public class velo {
    private String modele;
    private int niveauBatterie; 
    private boolean estLoue;

    public velo(String modele) {
        this.modele = modele;
        this.niveauBatterie = 100; 
        this.estLoue = false;
    }

    // Getters et Setters de base
    public String getModele() { return modele; }
    
    public int getNiveauBatterie() { return niveauBatterie; }
    public void setNiveauBatterie(int niveau) {
    if (niveau < 0 || niveau > 100) {
        throw new IllegalArgumentException(
            "Niveau de batterie invalide : " + niveau +
            ". La valeur doit etre comprise entre 0 et 100."
        );
    }
    this.niveauBatterie = niveau;
}


    public boolean isEstLoue() { return estLoue; }
    public void setEstLoue(boolean estLoue) { this.estLoue = estLoue; }

    public void afficherInfos() {
        String statut = estLoue ? "Loué" : "Disponible";
        System.out.println("Velo " + modele + " | Batterie: " + niveauBatterie + "% | Statut: " + statut);
    }
}
