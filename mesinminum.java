
import java.util.Scanner;

public class mesinminum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MESIN MINUMAN ===");
        System.out.println("1. Air Mineral");
        System.out.println("2. Teh");
        System.out.println("3. Kopi");
        System.out.println("4. Susu");

        System.out.print("Pilih minuman: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Air Mineral");
                System.out.println("Harga: Rp3000");
                break;

            case 2:
                System.out.println("Teh");
                System.out.println("Harga: Rp4000");
                break;

            case 3:
                System.out.println("Kopi");
                System.out.println("Harga: Rp5000");
                break;

            case 4:
                System.out.println("Susu");
                System.out.println("Harga: Rp6000");
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}
