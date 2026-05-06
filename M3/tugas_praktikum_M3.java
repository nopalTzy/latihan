package M3;
import java.util.Scanner;
public class tugas_praktikum_M3 {
    
   public static void main(String[] args) {
    Scanner GS = new Scanner(System.in);

    int bus = 0, minibus = 0, mobil = 0, sisa = 0, jumlah = 0;

    System.out.print("Masukkan Jumlah Penumpang = ");
    jumlah = GS.nextInt();

    bus = jumlah / 50;
    sisa = jumlah % 50;

    minibus = sisa / 15;
    sisa = sisa % 15;

    mobil = sisa / 7;
    sisa = sisa % 7;

    if (sisa != 0) {
        mobil = mobil + 1;
    }

    System.out.println("Membutuhkan Bus " +bus + ", Minibus "+minibus + ", Mobil "+mobil + ".");

    GS.close();

   }

}
