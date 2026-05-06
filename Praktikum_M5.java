import java.util.Scanner;
public class Praktikum_M5 {
    
    public static void main(String[] args) {
        Scanner GS = new Scanner(System.in);

        int batas, kelipatan, angka;
        
        System.out.print("Batas = ");
         batas = GS.nextInt();

         System.out.print("kelipatan = ");
         kelipatan = GS.nextInt();

         for (int i = 1; i < batas;i=i+kelipatan) {
            System.out.println(i+" ");
         }

         System.out.println(" ");

         GS.close();
    }
}
