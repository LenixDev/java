import java.util.Scanner;

public class Livre {
  String titre;
  String auteur;
  int prix;

  public Livre(String titre, String auteur, int prix) {
    titre = this.titre;
    auteur = this.auteur;
    prix = this.prix;
  }

  public static void Afficher() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre le titre: ");
    String title = sc.nextString();
    System.out.println("Entre l'auteur: ");
    String author = sc.nextString();
    System.out.println("Entre le prix: ");
    int price = sc.nextInt();

    Livre object = new Livre(title, author, price);
    System.out.println(object);
  }

  public static void main(String[] arg) {
    Afficher();
  }
}