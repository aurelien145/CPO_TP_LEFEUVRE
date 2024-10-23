/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_lefeuvre;

/**
 *
 * @author lefeu
 */
public class TP2_convertisseurObjet_LEFEUVRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un objet Convertisseur
        Convertisseur convertisseur = new Convertisseur();

        // Exemple de conversions
        System.out.println("25 C en Kelvin : " + convertisseur.celsiusVersKelvin(25));
        System.out.println("300K en Celsius : " + convertisseur.kelvinVersCelsius(300));
        System.out.println("0 C en Fahrenheit : " + convertisseur.celsiusVersFahrenheit(0));
        System.out.println("100 F en Celsius : " + convertisseur.fahrenheitVersCelsius(100));
        System.out.println("273K en Fahrenheit : " + convertisseur.kelvinVersFahrenheit(273));
        System.out.println("32 F en Kelvin : " + convertisseur.fahrenheitVersKelvin(32));

        // Affichage du nombre de conversions effectuées
        System.out.println(convertisseur);
    }
   
}

