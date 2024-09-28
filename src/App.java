import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        // création de l'objet scanner
        Scanner sc = new Scanner(System.in);
        try {
            // demande à l'utilisateur de saisir un nombre
            System.out.println("Entrez le 1er nombre :");
            int p1 = sc.nextInt();

            // demande de saisir le second nombre
            System.out.println("Entrez le 2e nombre :");
            int p2 = sc.nextInt();

            // création de l'objet Somme
            Somme calcul = new Somme();

            // appel de la méthode somme
            int resultat = calcul.somme(p1, p2);

            // Affichage du résultat
            System.out.println("Le résultat de " + p1 + " + " + p2 + " est : " + resultat);
        } catch (InputMismatchException e) {
            // gestion des erreurs
            System.out.println("Veuillez entrer des nombres entiers !");
        } finally {
            // fermer le scanner
            sc.close();
        }
    }
}
