import java.util.Scanner;
public class woi {

    public static void main(String[] args) {
       
        Scanner GS = new Scanner(System.in);

        /*
        membuat program untuk menghitung total SSKM berdasarkan kegiatan dan poin SSKM dari kegiatan yang diinputkan
        kegiatan bisa diinput dari 5 data
        
        output"
        bimbingan karir = 5 poin
        seminar AI = 3 poin
        total = 8 poin
        */

        //input
        String nama_kegiatan = " ";
        int poin_sskm = 0, total = 0;

        //pengulangan input data 5x
        for (int i = 1; i < 6; i++) {
            //isi input 5x
            System.out.println("Data Ke = " + i);
            System.out.print("Nama Kegiatan = ");
            nama_kegiatan = GS.nextLine();
            System.out.print("Poin SSKM = ");
            poin_sskm = GS.nextInt();
            System.out.println();
            GS.nextLine();

            //hitung total
            total += poin_sskm;
            
        }     
        System.out.println("Total =  " + total);   

        GS.close();
    }
}