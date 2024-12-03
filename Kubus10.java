import java.util.Scanner;

public class Kubus10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisi, luasPermukaan, volume;

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc.nextInt();

        luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);

        volume = hitungVolume(sisi);
        System.out.println("Volume kubus adalah: " + volume);
    }

    static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi); 
    }

    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi; 
    }
}
