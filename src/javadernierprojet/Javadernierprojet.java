/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadernierprojet;

/**
 *
 * @author alae2
 */
public class Javadernierprojet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        station maStation = new station("Centre-Ville");

        velo v1 = new velo("E-Ride 2000");
        velo v2 = new velo("Volt-Bike");

        maStation.ajouterVelo(v1);
        maStation.ajouterVelo(v2);

        maStation.afficherEtatStation();
        
        // Simulation d'une location
        v1.setEstLoue(true);
        v1.setNiveauBatterie(45);
        
        maStation.afficherEtatStation();
    }
    }
