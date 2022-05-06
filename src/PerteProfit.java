import java.util.Scanner;

public class PerteProfit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cout;

        do {
            System.out.println("Entrez prix de fabrication");
            cout = scan.nextInt();
        } while (cout < 0);

        System.out.println("Entrez prix de vente");

        int prix = scan.nextInt();

        while (prix < 0) {
            System.out.println("Entrez prix de vente");
            prix = scan.nextInt();
        }

        if (cout > prix) {
            System.out.printf("Perte de %d €, tu t'es fait douiller!!!", (cout - prix));
        } else if (cout < prix) {
            System.out.printf("gain de %d €, t'es le roi du biz", (prix - cout));
        } else if (cout == prix) {
            System.out.printf("pas de perte pas de profit");
        }
    }
}
