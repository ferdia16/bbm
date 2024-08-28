package lat_soal;

import java.util.Scanner;

class lat_4 {
public static void main(String[] args) {
        // Mendefinisikan harga per liter untuk Pertamax dan Pertalite
        double HARGA_PERTAMAX = 15000; // Harga per liter Pertamax
        double HARGA_PERTALITE = 10000; // Harga per liter Pertalite
        double DISKON = 0.05; // Diskon 5%

        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan kepada pengguna
        System.out.println("Pilih jenis BBM:");
        System.out.println("1. Pertamax");
        System.out.println("2. Pertalite");
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = input.nextInt();


        double hargaPerLiter;
        switch (pilihan) {
            case 1:
                hargaPerLiter = HARGA_PERTAMAX;
                System.out.println("Harga per liter Pertamax: Rp" + hargaPerLiter);
                break;
            case 2:
                hargaPerLiter = HARGA_PERTALITE;
                System.out.println("Harga per liter Pertalite: Rp" + hargaPerLiter);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        // Meminta jumlah liter yang ingin dibeli
        System.out.print("Masukkan jumlah liter yang ingin dibeli: ");
        double jumlahLiter = input.nextDouble();

        // Menghitung total harga sebelum diskon
        double totalHarga = hargaPerLiter * jumlahLiter;

        // Memberikan diskon jika jumlah liter lebih dari 25
        if (jumlahLiter > 25) {
            totalHarga -= totalHarga * DISKON;
            System.out.println("Anda mendapatkan diskon 5%!");
        }

        // Menampilkan total harga yang harus dibayar
        System.out.println("Total harga yang harus dibayar: Rp" + totalHarga);

        input.close();
    }
}                  