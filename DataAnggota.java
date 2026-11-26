 
import java.util.Scanner;

public class DataAnggota {

    static boolean cariAnggota(String nama, String[] anggota) {

        for (int i = 0; i < anggota.length; i++) {

            if (anggota[i].equals(nama)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] anggota = {"Andi", "Budi", "Citra", "Dina", "Eko"};

        System.out.print("Masukkan nama: ");
        String cari = input.nextLine();

        if (cariAnggota(cari, anggota)) {
            System.out.println("Nama terdaftar!");
        } else {
            System.out.println("Nama tidak terdaftar!");
        }

        input.close();
    }
}
 
