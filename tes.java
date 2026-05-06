import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        
        Scanner GS = new Scanner(System.in);

        int orang = 0, total = 0;
        System.out.println("Wisata Kebun Ayur Sayurrr");
        System.out.print("Berapa Orang = ");
        orang = GS.nextInt();

        total += orang;
        System.out.println("Total = " +total);
    }
}
