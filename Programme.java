import java.util.Scanner;

public class Programme {
  public static int calcEntier() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez un entier: ");
    int entier1 = sc.nextInt();
    System.out.print("Entrez un autre entier: ");
    int entier2 = sc.nextInt();
    System.out.println("Choisissez une expression pour " + entier1 + " ? " + entier2 + ":");
    System.out.println("0. +");
    System.out.println("1. -");
    System.out.println("2. *");
    System.out.println("3. /");
    int expression = sc.nextInt();
    sc.close();
    switch (expression) {
      case 1:
        return entier1 + entier2;
      case 2:
        return entier1 - entier2;
      case 3:
        return entier1 * entier2;
      case 4:
        return entier1 / entier2;
      default:
        return 0;
    }
  }

  public static void main(String[] args) {
    int result = calcEntier();
    System.out.println("Le resultat est : " + result);
  }
}
