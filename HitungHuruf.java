
import java.util.Scanner;

public class HitungHuruf {

    static int hitungKarakter(String kalimat) {
        return kalimat.length();
    }

    static int hitungA(String kalimat) {
        int jumlah = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == 'a' || kalimat.charAt(i) == 'A') {
                jumlah++;
            }
        }

        return jumlah;
    }

    static String hurufKapital(String kalimat) {
        return kalimat.toUpperCase();
    }

    static char karakterPertama(String kalimat) {
        return kalimat.charAt(0);
    }

    static char karakterTerakhir(String kalimat) {
        return kalimat.charAt(kalimat.length() - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("Jumlah karakter: " + hitungKarakter(kalimat));
        System.out.println("Jumlah huruf A: " + hitungA(kalimat));
        System.out.println("Huruf kapital: " + hurufKapital(kalimat));
        System.out.println("Karakter pertama: " + karakterPertama(kalimat));
        System.out.println("Karakter terakhir: " + karakterTerakhir(kalimat));

        input.close();
    }
}
