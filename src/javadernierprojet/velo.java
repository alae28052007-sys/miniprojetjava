/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

/**
 *
 * @author alae2
 */
public class velo {
    private String modele;
    private int niveauBatterie; 
    private boolean estLoue;
    private List<HistoriqueLocation> historique = new ArrayList<>();

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
public void louer() {
    if (this.estLoue) {
        System.out.println("Erreur : ce velo est deja loue.");
        return;
    }
    // Creer un enregistrement d'historique avec la date actuelle
    HistoriqueLocation loc = new HistoriqueLocation(
        LocalDateTime.now(), this.niveauBatterie
    );
    historique.add(loc);
    this.estLoue = true;
}
public void restituer(int niveauFin) {
    if (!this.estLoue) {
        System.out.println("Erreur : ce velo n'est pas loue.");
        return;
    }
    // Cloturer la derniere location de l'historique
    if (!historique.isEmpty()) {
        HistoriqueLocation derniere = historique.get(historique.size() - 1);
        derniere.terminer(LocalDateTime.now(), niveauFin);
    }
    setNiveauBatterie(niveauFin);
    this.estLoue = false;
public void afficherHistorique() {
    System.out.println("=== Historique du velo " + id + " (" + marque + ") ===");
    if (historique.isEmpty()) {
        System.out.println("Aucune location enregistree.");
    } else {
        for (int i = 0; i < historique.size(); i++) {
            System.out.println((i + 1) + ". " + historique.get(i));
        }
    }
}
