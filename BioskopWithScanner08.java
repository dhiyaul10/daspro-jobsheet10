import java.util.Scanner;
public class BioskopWithScanner08 {

    public static void main(String[] args) {

        Scanner input08 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = input08.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = input08.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = input08.nextInt();
            input08.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input08.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
    
}