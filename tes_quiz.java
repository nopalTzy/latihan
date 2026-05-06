import java.util.Scanner;
public class tes_quiz {

    public static void main(String[] args) {
        Scanner GS = new Scanner(System.in);

        //input
        int nilai = 0, total = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Kegiatan Ke = " + i);
            System.out.print("Nilai = ");
            nilai = GS.nextInt();
            System.out.println();
            GS.nextLine();

            total += nilai;

        }
        System.out.println("Total Nilai = " + total);

        if (total < 80) {
            System.out.println("Perlu Evaluasi");
        } else {
            System.out.println("Baik");
        }

        GS.close();
    }
    
}
