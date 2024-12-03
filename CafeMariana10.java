import java.util.Scanner;

public class CafeMariana10 {

    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, 
        {30, 80, 40, 25, 10, 50, 45}, 
        {5, 9, 20, 25, 15, 20, 45},   
        {50, 8, 17, 18, 10, 10, 6},   
        {15, 10, 16, 15, 10, 10, 55}  
    };
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void MenuUtama() {
        System.out.println("===== MENU UTAMA =====");
        System.out.println("1. Input Data Penjualan");
        System.out.println("2. Tampilkan Seluruh Data Penjualan");
        System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
        System.out.println("4. Tampilkan Rata-rata Penjualan Setiap Menu");
        System.out.println("5. Keluar");
        System.out.println("=======================");
        System.out.print("Pilih menu: ");
    }

    public static void inputPenjualan(Scanner scanner) {
        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Data penjualan berhasil diinput!");
    }

    public static void tampilkanSemuaPenjualan() {
        System.out.println("\n=== Semua Data Penjualan ===");
        System.out.printf("%-12s", "Menu");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Hari %d\t", i);
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-12s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%d\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        int maxPenjualan = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + menuTertinggi + " (" + maxPenjualan + ")");
    }

    public static void rataRataPenjualan() {
        System.out.println("\n=== Rata-rata Penjualan Setiap Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.printf("Rata-rata penjualan %s: %.2f\n", menu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            MenuUtama();
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputPenjualan(scanner);
                    break;
                case 2:
                    tampilkanSemuaPenjualan();
                    break;
                case 3:
                    menuTertinggi();
                    break;
                case 4:
                    rataRataPenjualan();
                    break;
                case 5:
                    running = false;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
