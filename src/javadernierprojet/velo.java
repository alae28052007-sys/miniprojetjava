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

    public velo(int id, String marque, int niveauBatterie, double capaciteBatterie) {
    this.id = id;
    this.marque = marque;
    setNiveauBatterie(niveauBatterie)
    this.capaciteBatterie = capaciteBatterie;
    this.estLoue = false;
}
    public double getCapaciteBatterie() {
        return capaciteBatterie;
}
    public void setCapaciteBatterie(double capacite) {
    if (capacite < 300 || capacite > 1000) {
        throw new IllegalArgumentException(
            "Capacite invalide : " + capacite +
            ". Doit etre entre 300 et 1000 Wh."
        );
    }
    this.capaciteBatterie = capacite;
}
    public double getCapaciteBatterie() {
    return capaciteBatterie;
}
    public void setCapaciteBatterie(double capacite) {
    if (capacite < 300 || capacite > 1000) {
        throw new IllegalArgumentException(
            "Capacite invalide : " + capacite +
            ". Doit etre entre 300 et 1000 Wh."
        );
    }
    this.capaciteBatterie = capacite;
}
    public double getAutonomieKm() {
    return (capaciteBatterie * niveauBatterie / 100.0) / 5.0;
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
