import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner GS = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = GS.nextInt();

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + i);

            System.out.print("Masukkan nilai (A/B/C/D/E): ");
            char nilaiHuruf = GS.next().toUpperCase().charAt(0);

            System.out.print("Masukkan jumlah SKS: ");
            int sks = GS.nextInt();

            double nilaiAngka = konversiNilai(nilaiHuruf);

            totalNilai += nilaiAngka * sks;
            totalSKS += sks;
        }

        double ips = totalNilai / totalSKS;

        System.out.println("\nIPS Anda: " + String.format("%.2f", ips));

        int maxSKS = hitungMaxSKS(ips);
        System.out.println("Maksimal SKS yang boleh diambil: " + maxSKS);

        GS.close();
    }

    // Konversi nilai huruf ke angka
    public static double konversiNilai(char nilai) {
        switch (nilai) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'E': return 0.0;
            default: return 0.0;
        }
    }

    // Menentukan maksimal SKS berdasarkan IPS
    public static int hitungMaxSKS(double ips) {
        if (ips >= 3.50) {
            return 24;
        } else if (ips >= 3.00) {
            return 22;
        } else if (ips >= 2.00) {
            return 20;
        } else {
            return 18;
        }
    }

}
