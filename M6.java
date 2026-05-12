import java.util.Scanner;
public class M6 {
    public static void main(String[] args) {
        Scanner GS = new Scanner(System.in);
        
     
        String[] kategori = new String[100];
        int[] harga = new int[100];
        int[] jumlahBeli = new int[100];
        
        int jumlahData = 0;
        int pilihan = 0;

        do {
            System.out.println("\n=== Pemesanan Tiket SurabayaZoo ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input jumlah beli");
            System.out.println("3. Lihat total bayar");
            System.out.println("4. Keluar program");
            System.out.print("Pilih menu (1-4): ");
            pilihan = GS.nextInt();
            GS.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah jenis kategori yang ingin diinput: ");
                    jumlahData = GS.nextInt();
                    GS.nextLine();
                    
                    for (int i = 0; i < jumlahData; i++) {
                        System.out.println("\nData ke-" + (i + 1));
                        System.out.print("Nama Kategori: ");
                        kategori[i] = GS.nextLine();
                        System.out.print("Harga Tiket  : ");
                        harga[i] = GS.nextInt();
                        GS.nextLine();
                    }
                    System.out.println("--- Data Berhasil Disimpan ---");
                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println("Silakan isi menu 1 terlebih dahulu!");
                    } else {
                        System.out.println("\n--- Input Jumlah Beli ---");
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.print("Jumlah beli untuk kategori " + kategori[i] + ": ");
                            jumlahBeli[i] = GS.nextInt();
                            GS.nextLine();
                        }
                    }
                    break;

                case 3:
                    if (jumlahData == 0) {
                        System.out.println("Data masih kosong!");
                    } else {
                        long totalKeseluruhan = 0;
                        System.out.println("\n========================================");
                        System.out.println("         RINCIAN PEMBAYARAN");
                        System.out.println("========================================");
                        System.out.printf("%-15s %-10s %-5s %-10s\n", "Kategori", "Harga", "Qty", "Subtotal");
                        
                        for (int i = 0; i < jumlahData; i++) {
                            long subtotal = (long) harga[i] * jumlahBeli[i];
                            System.out.printf("%-15s %-10d %-5d %-10d\n", kategori[i], harga[i], jumlahBeli[i], subtotal);
                            totalKeseluruhan += subtotal;
                        }
                        
                        System.out.println("----------------------------------------");
                        System.out.println("TOTAL BAYAR : Rp " + totalKeseluruhan);
                        System.out.println("========================================");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah Berkunjung Ke SurabayaZoo!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        GS.close();
    }
}
