import java.util.Scanner;

public class hewan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("1. Ayam");
        System.out.print("\n2. Beruang");
        System.out.print("\nMasukkan pilihan (1/2): ");
        int pilihan = input.nextInt();

        switch(pilihan) {
            case 1:
                System.out.print("Kamu memilih Ayam");
                break;
            case 2:
                System.out.print("Kamu memilih Beruang");
                break;
            default:
                break;
        }
    }
}
