 import java.util.Scanner;

public class kelipatannn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        int total = hitungKelipatan(batas);

        System.out.println("Jumlah bilangan kelipatan 3 dari 1 sampai " + batas + " adalah: " + total);

        input.close();
    }

    static int hitungKelipatan(int angka) {
        int jumlah = 0;

        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {
                jumlah++;
            }
        }

        return jumlah;
    }
} 
