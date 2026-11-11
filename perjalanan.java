
import java.util.Scanner;

public class perjalanan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jarak, biayaPerKm, biayaParkir, totalBiaya;

        System.out.print("Masukkan jarak perjalanan (km): ");
        jarak = input.nextInt();

        System.out.print("Masukkan biaya per km: ");
        biayaPerKm = input.nextInt();

        System.out.print("Masukkan biaya parkir: ");
        biayaParkir = input.nextInt();

        totalBiaya = (jarak * biayaPerKm) + biayaParkir;

        System.out.println("Total biaya perjalanan: Rp" + totalBiaya);

        input.close();
    }
}
