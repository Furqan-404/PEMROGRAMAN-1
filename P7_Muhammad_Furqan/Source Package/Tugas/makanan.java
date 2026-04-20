import java.util.Scanner;

public class makanan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilihan, jumlah;
        int harga = 0;
        String menu = "";

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng  (15000)");
        System.out.println("2. Mie Ayam     (12000)");
        System.out.println("3. Bakso        (13000)");
        System.out.println("4. Ayam Geprek  (18000)");
        System.out.print("Pilih menu (1-4): ");
        pilihan = input.nextInt();

        // SWITCH untuk menentukan menu & harga
        switch (pilihan){
            case 1:
                menu = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                menu = "Mie Ayam";
                harga = 12000;
                break;
            case 3:
                menu = "Bakso";
                harga = 13000;
                break;
            case 4:
                menu = "Ayam Geprek";
                harga = 18000;
                break;
            default:
                System.out.println("Menu tidak tersedia!");
                return;
        }

        System.out.print("Masukkan jumlah beli: ");
        jumlah = input.nextInt();

        int total = harga * jumlah;

        // IF-ELSE untuk diskon
        if (jumlah >= 3){
            double diskon = total * 0.10; // 10%
            total -= diskon;
            System.out.println("Anda mendapat diskon 10%");
        } else {
            System.out.println("Tidak ada diskon");
        }

        // Output
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Menu   : " + menu);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : Rp " + total);

        input.close();
    }
}