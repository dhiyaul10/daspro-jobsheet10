import java.util.Scanner;

public class BioskopWithScanner08Modif4 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int choice = input08.nextInt();
            input08.nextLine();

            switch (choice) {
                case 1:
                    do {
                        System.out.print("Masukkan Nama: ");
                        nama = input08.nextLine();
                        System.out.print("Masukkan Baris: ");
                        baris = input08.nextInt();
                        System.out.print("Masukkan Kolom: ");
                        kolom = input08.nextInt();
                        input08.nextLine();

                        if (isValidSeat(baris, kolom, penonton)) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                            break;
                        } else {
                            System.out.println("Baris atau kolom tidak valid atau kursi sudah terisi.");
                            System.out.println("Silahkan coba lagi.");
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silahkan pilih menu 1, 2, atau 3.");
            }

            System.out.print("Kembali ke menu utama? (y/n): ");
            next = input08.nextLine();

            if (next.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih!");
                break;
            }
        }

        input08.close();
    }

    public static boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
            if (penonton[baris - 1][kolom - 1] == null) {
                return true;
            }
        }
        return false;
    }
}
