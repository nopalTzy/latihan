import java.util.Scanner;
public class quiz {
    
    public static void main(String[] args) {
        Scanner GS = new Scanner(System.in);

        int nilai = 0, total = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Kegiatan ke = " + i);
            System.out.print("nilai = ");
            nilai = GS.nextInt();
            System.out.println();
            GS.nextLine();

            total += nilai;

        }
        System.out.println("Total Nilai =" + total);

        if (total < 80) {
            System.out.println("Perlu Evaluasi");
        } else {
            System.out.println("Baik");
        }
        GS.close();
    }
}
