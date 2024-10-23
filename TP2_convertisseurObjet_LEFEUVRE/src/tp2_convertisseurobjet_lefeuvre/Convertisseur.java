package tp2_convertisseurobjet_lefeuvre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lefeu
 */
public class Convertisseur {
    // Attribut pour compter le nombre de conversions
    private int nbConversions;

    // Constructeur pour initialiser le compteur
    public Convertisseur() {
        this.nbConversions = 0;
    }

    // Méthode pour convertir Celsius en Kelvin
    public double celsiusVersKelvin(double tempCelsius) {
        nbConversions++;
        return tempCelsius + 273.15;
    }

    // Méthode pour convertir Kelvin en Celsius
    public double kelvinVersCelsius(double tempKelvin) {
        nbConversions++;
        return tempKelvin - 273.15;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public double celsiusVersFahrenheit(double tempCelsius) {
        nbConversions++;
        return (tempCelsius * 9/5) + 32;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public double fahrenheitVersCelsius(double tempFahrenheit) {
        nbConversions++;
        return (tempFahrenheit - 32) * 5/9;
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public double kelvinVersFahrenheit(double tempKelvin) {
        nbConversions++;
        return (tempKelvin - 273.15) * 9/5 + 32;
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public double fahrenheitVersKelvin(double tempFahrenheit) {
        nbConversions++;
        return (tempFahrenheit - 32) * 5/9 + 273.15;
    }

    // Méthode toString pour afficher le nombre de conversions
    @Override
    public String toString() {
        return "Nombre de conversions effectuees : " + nbConversions;
    }
}
