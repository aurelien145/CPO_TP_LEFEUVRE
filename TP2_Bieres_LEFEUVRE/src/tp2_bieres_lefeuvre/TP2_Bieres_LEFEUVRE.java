/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lefeuvre;

/**
 *
 * @author lefeu
 */
public class TP2_Bieres_LEFEUVRE {

   
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("a",(float)0,"l");
        
        // Assignation des valeurs aux attributs
        uneBiere.nom = "Cuvee des trolls";
        uneBiere.degreAlcool = 7.0f;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        
        // Appel de la méthode lireEtiquette pour afficher les informations de l'étiquette
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        uneBiere.Decapsuler();
       uneBiere.Decapsuler();
    }
    
}
