import java.util.Scanner;

public class jurusan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilihan;

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Daftar");
            System.out.println("2. Keluar");
            System.out.print("Pilih (1/2): ");

            if (!input.hasNextInt()) {
                System.out.println("Input harus angka!");
                input.nextLine();
                continue;
            }

            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1){
                System.out.print("Masukkan Nama: ");
                String nama = input.nextLine();

                System.out.print("Masukkan Jurusan: ");
                String jurusan = input.nextLine();

                if (jurusan.equalsIgnoreCase("Teknik Informatika")){
                    System.out.println("✅ Selamat datang " + nama);

                    String kelas;
                    while (true) {
                        System.out.println("\nPilih Kelas (ketik langsung):");
                        System.out.println("- REG A");
                        System.out.println("- REG B");
                        System.out.println("- REG CK");
                        System.out.println("- REG CS");
                        System.out.print("Masukkan kelas: ");

                        kelas = input.nextLine().toUpperCase();

                        if (kelas.equals("REG A") || kelas.equals("REG B") ||
                            kelas.equals("REG CK") || kelas.equals("REG CS")) {
                            break;
                        } else {
                            System.out.println("❌ Kelas tidak valid, coba lagi!");
                        }
                    }

                    System.out.println("\n🎉 DATA BERHASIL DISIMPAN");
                    System.out.println("Nama   : " + nama);
                    System.out.println("Jurusan: Teknik Informatika");
                    System.out.println("Kelas  : " + kelas);

                } else {
                    System.out.println("❌ Maaf, hanya untuk Teknik Informatika!");
                }

            } else if (pilihan == 2){
                System.out.println("Terima kasih! Program selesai.");
                break;

            } else {
                System.out.println("❌ Pilihan tidak valid!");
            }
        }

        input.close();
    }
}