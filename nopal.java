import java.util.Scanner;

public class nopal {
    public static void main(String[] args) {
        Scanner GS = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Ganjil = ");
        int n = GS.nextInt();
        if (n % 2 == 0) {
            System.out.println("bilangan bukan ganjil");
        } else {
            int posisiTengah = n / 2;
            for (int i = 1; i <= n + 2; i++) {
                if (i == 1 || i == n + 2) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                } else {
                    for (int s = 0; s < posisiTengah; s++) {
                        System.out.print(" ");
                    }
                    System.out.println(i - 1);
                }
            }
        }
        GS.close();
    }
}