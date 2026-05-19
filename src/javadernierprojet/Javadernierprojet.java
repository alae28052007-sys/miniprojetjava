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
    import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Velo velo = new Velo(1, "Trek", 100, 500);

        velo.louer();
        System.out.println("Velo loue : " + velo);
        velo.restituer(70);
        System.out.println("Velo restitue : " + velo);

        velo.louer();
        velo.restituer(40);

        velo.afficherHistorique();
    }
}

