import java.util.Scanner;
public class UTS {
    public static void main(String[] args) {
        Scanner GS = new Scanner(System.in);
        

        int [] nilai = new int[5];
        String [] nama = new String[5];

        for (int i = 0; i < 5; i++) {
           System.out.print("Masukkan Nama Peserta Ke " + i + " = ");
           nama[i] = GS.nextLine(); 
           System.out.print("Masukkan Nilai Peserta Ke " + i + " = ");
           nilai[i] = GS.nextInt();
           GS.nextLine(); 
        }   
           
        System.out.print("\nMasukkan Nilai Minimum = ");
        int minimum = GS.nextInt();

       
        int nilaiTerendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

       
        System.out.println("  HASIL  ");
        for (int i = 0; i < nama.length; i++) {
            if (nilai[i] < minimum) {
                System.out.println(nama[i] + " : " + nilai[i] + " GAGAL");
            } else {
                System.out.println(nama[i] + " : " + nilai[i] + " LULUS");
            }
        }
        GS.close();
    }
}
