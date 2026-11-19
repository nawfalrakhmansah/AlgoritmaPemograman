public class kelipatan {
    public static void main(String[] args) {

        int jumlah = 0;

        for (int i = 1; i <= 40; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                jumlah++;
            }
        }

        System.out.println("Jumlah angka: " + jumlah);
    }
}


