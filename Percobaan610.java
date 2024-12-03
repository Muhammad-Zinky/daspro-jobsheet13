import java.util.Scanner;

public class Percobaan610 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

       int p, l, t, L, vol;

       System.out.print("masukkan panjang :");
       p=sc.nextInt();
       System.out.print("masukkan lebar :");
       l=sc.nextInt();
       System.out.print("masukkan tinggi :");
       t=sc.nextInt();

       L=p*l;
       System.out.println("luas persegi panjang adalah " + L);

       vol=p*l*t;
       System.out.println("volume balok adalah " +vol);

    }
       static int  hitungLuas (int pjg, int lb){
        return pjg * lb;
       }
       static int hitungVolume (int tinggi, int a, int b){
        int volume=hitungLuas(a,b)*tinggi;
        return volume;
    }
}