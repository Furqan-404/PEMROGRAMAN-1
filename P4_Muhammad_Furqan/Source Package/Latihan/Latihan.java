import java.util.Scanner;

public class Latihan {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float kehadiran;
        float tugas;
        float nilai_uts;
        float nilai_uas;

        // Bobot (dalam persen)
        float bobot_kehadiran = 0.10f;
        float bobot_tugas = 0.20f;
        float bobot_uts = 0.30f;
        float bobot_uas = 0.40f;

        int total_pertemuan = 21;

        System.out.print("Input jumlah kehadiran (max 21): ");
        kehadiran = input.nextFloat();

        System.out.print("Input nilai tugas: ");
        tugas = input.nextFloat();

        System.out.print("Input nilai UTS: ");
        nilai_uts = input.nextFloat();

        System.out.print("Input nilai UAS: ");
        nilai_uas = input.nextFloat();

        float nilai_kehadiran = (kehadiran / total_pertemuan) * 100;

        float total = (nilai_kehadiran * bobot_kehadiran)
                    + (tugas * bobot_tugas)
                    + (nilai_uts * bobot_uts)
                    + (nilai_uas * bobot_uas);

        System.out.println("\n===== HASIL =====");
        System.out.println("Nilai Kehadiran : " + nilai_kehadiran);
        System.out.println("Nilai Akhir     : " + total);

        input.close();
    }
}