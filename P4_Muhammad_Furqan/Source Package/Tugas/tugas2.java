import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input harga makanan
        System.out.print("Harga Nasi Goreng: ");
        double nasiGoreng = input.nextDouble();

        System.out.print("Harga Es Teh: ");
        double esTeh = input.nextDouble();

        System.out.print("Harga Ayam Bakar: ");
        double ayamBakar = input.nextDouble();

        // Hitung total
        double total = nasiGoreng + esTeh + ayamBakar;

        // Output total
        System.out.println("\n=== Total Pembayaran ===");
        System.out.println("Total = " + total);

        // Hitung persentase
        double persenNasi = (nasiGoreng / total) * 100;
        double persenEsTeh = (esTeh / total) * 100;
        double persenAyam = (ayamBakar / total) * 100;

        // Output persentase
        System.out.println("\n=== Persentase ===");
        System.out.println("Nasi Goreng = " + persenNasi + "%");
        System.out.println("Es Teh = " + persenEsTeh + "%");
        System.out.println("Ayam Bakar = " + persenAyam + "%");

        input.close();
    }
}