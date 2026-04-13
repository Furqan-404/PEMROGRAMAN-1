import java.util.Scanner;

public class latihanP5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBarang = {"Beras", "Minyak", "Gula", "Telur", "Susu"};
        int[] hargaBarang = {12000, 15000, 10000, 20000, 18000};
        int[] jumlahBeli = new int[namaBarang.length];

        int totalBelanja = 0;

        System.out.println("=== Daftar Barang Swalayan ===");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println(i + ". " + namaBarang[i] + " - Rp" + hargaBarang[i]);
        }

        System.out.println("\nMasukkan jumlah beli setiap barang:");

        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print(namaBarang[i] + ": ");
            jumlahBeli[i] = input.nextInt();
        }

        System.out.println("\n=== Struk Belanja ===");
        for (int i = 0; i < namaBarang.length; i++) {
            int subtotal = jumlahBeli[i] * hargaBarang[i];
            totalBelanja += subtotal;

            if (jumlahBeli[i] > 0) {
                System.out.println(namaBarang[i] + " x " + jumlahBeli[i] +
                        " = Rp" + subtotal);
            }
        }

        System.out.println("--------------------------");
        System.out.println("Total Belanja = Rp" + totalBelanja);

        input.close();
    }
}