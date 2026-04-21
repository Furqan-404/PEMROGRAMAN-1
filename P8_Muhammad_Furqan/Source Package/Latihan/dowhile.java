import java.util.Scanner;

public class dowhile {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nilai;

        do { 
            System.out.print("Masukkan nilai: ");
            nilai = input.nextInt();

            if(nilai < 75){
                System.out.print("Nilai belum memenuhi");
            }
        } while (nilai > 75);
        System.out.print("Nilai memenuhi!");
    }
}
