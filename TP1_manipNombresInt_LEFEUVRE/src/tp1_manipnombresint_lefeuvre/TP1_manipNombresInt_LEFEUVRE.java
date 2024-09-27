/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_manipnombresint_lefeuvre;
import java.util.Scanner;
/**
 *
 * @author lefeu
 */
public class TP1_manipNombresInt_LEFEUVRE {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        // Demander les deux opérandes
        System.out.println("Veuillez entrer le premier nombre :");
        int entier1 = sc.nextInt();
        System.out.println("Veuillez entrer le deuxieme nombre :");
        int entier2 = sc.nextInt();

        // Afficher le résultat
        System.out.println("Les entier sont : " + entier1 +" et " + entier2);
        System.out.println("Leur somme est : " + (entier1+entier2));
        System.out.println("Leur difference est : " + Math.abs(entier1-entier2));
        System.out.println("Leur produit est : " + (entier1*entier2));
        if (entier1 >= entier2) {
            System.out.println("le quotiens de la division euclidienne du premier par le second: " + (entier1/entier2)+" et le reste est " +(((entier1/entier2)*entier1)- entier2));
    }else{System.out.println("le quotiens de la division euclidienne du second par le premier : " + (entier2/entier1)+" et le reste est " +(((entier2/entier1)*entier2)- entier1));
    }
  }
        
}
