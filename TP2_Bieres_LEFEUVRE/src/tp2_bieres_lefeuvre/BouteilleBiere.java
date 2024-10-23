
package tp2_bieres_lefeuvre;


public class BouteilleBiere {
    String nom;           // Nom de la bière
    float degreAlcool;    // Degré d'alcool
    String brasserie;     // Brasserie qui produit la bière
    boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)\nBrasserie : " + brasserie);
    }
   public BouteilleBiere( String nom, float degreAlcool,String brasserie){
       this.nom = nom;
       this.degreAlcool = degreAlcool;
       this.brasserie = brasserie;
       this.ouverte = false;
   }
    public boolean Decapsuler() {
        if (ouverte) {  // Si la bouteille est déjà ouverte
            System.out.println("Erreur : la biere est deja ouverte !");
            return false;  // Échec de l'ouverture
        } else {
            ouverte = true;  // On ouvre la bouteille
            System.out.println("La bouteille de " + nom + " est maintenant ouverte.");
            return true;  // Succès de l'ouverture
        }
    }
}


