import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choix;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter");
            System.out.println("2. Afficher");
            System.out.println("3. Rechercher");
            System.out.println("4. Supprimer");
            System.out.println("5. Quitter");
            System.out.println("Choix: ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Ajouter");
                    break;
                case 2:
                    System.out.println("Afficher");
                    break;
                case 3:
                    System.out.println("Rechercher");
                    break;
                case 4:
                    System.out.println("Supprimer");
                    break;
            }
        }while (choix != 0);
        sc.close();
    }
}
