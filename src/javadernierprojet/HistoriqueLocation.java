/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package green.it.fleet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistoriqueLocation {

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private int batterieConsommee;

    public HistoriqueLocation(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
        this.dateFin = null;
        this.batterieConsommee = 0;
    }

    public void terminerLocation(LocalDateTime dateFin, int batterieConsommee) {
        this.dateFin = dateFin;
        this.batterieConsommee = batterieConsommee;
    }

    public void afficherHistorique() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("  Debut : " + dateDebut.format(fmt));
        if (dateFin != null) {
            System.out.println("  Fin   : " + dateFin.format(fmt));
        } else {
            System.out.println("  Fin   : en cours");
        }
        System.out.println("  Batterie consommee : " + batterieConsommee + "%");
        System.out.println("  ---");
    }
}