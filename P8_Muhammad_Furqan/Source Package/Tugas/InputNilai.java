import java.util.Scanner;

public class InputNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.print("\n=== MENU ===");
            System.out.print("\n1. Input Nilai");
            System.out.print("\n2. Keluar");
            System.out.print("\nPilih: ");

            if (input.hasNextInt()) {
                pilihan = input.nextInt();

                if (pilihan == 1 || pilihan == 2) {
                    break;
                } else {
                    System.out.println("Pilihan hanya 1 atau 2!\n");
                }
            } else {
                System.out.println("Input harus angka!\n");
                input.next();
            }
        }

        switch (pilihan) {
            case 1:
                int nilai;

                while (true) {
                    System.out.print("Masukkan nilai (0-100): ");

                    if (input.hasNextInt()) {
                        nilai = input.nextInt();

                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus antara 0 - 100!\n");
                        } else if (nilai < 75) {
                            System.out.println("Nilai belum memenuhi (>=75), coba lagi!\n");
                        } else {
                            break; // lolos semua → ke S4
                        }

                    } else {
                        System.out.println("Input harus angka!\n");
                        input.next(); // buang input salah
                    }
                }

                System.out.println("Nilai memenuhi! (>=75)");
                System.out.println("Nilai akhir: " + nilai);
                break;

            case 2:
                System.out.println("Program selesai.");
                break;
        }
    }
}