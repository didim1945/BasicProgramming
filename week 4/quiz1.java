// Nama: Dimas Wahyu Ramadhani
// Kelas: TI-1D
// NIM: 264107020104

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === DEKLARASI ===
        int tarifDasar;
        int jarak;
        int biayaBBM;
        double komisi; //Seharusnya pake double bukan int
        double resikoTerlambat; //Seharusnya pake double bukan int
        int jumlahTransaksiDriver;
        double keuntunganDriver;

        int hargaJualMakanan;
        int biayaMakanan;
        double resikoKerusakan; //Seharusnya pake double bukan int 
        int jumlahTransaksiMerchant;
        double keuntunganMerchant;
    
        int totalTransaksi;
        double rataKeuntungan; 
        double totalKeuntungan;

        double persDriver;
        double persMerchant;



        // === KEUNTUNGAN DRIVER ===
        //Input Variabel Keuntungan Driver
        System.out.println("=== KEUNTUNGAN DRIVER ===");
        System.out.print("Tarif: Rp. ");
        tarifDasar = sc.nextInt();
        System.out.print("Masukkan jarak perjalanan (KM): ");
        jarak = sc.nextInt();
        System.out.print("Masukkan biaya bahan bakar: Rp. ");
        biayaBBM = sc.nextInt();
        System.out.print("Masukkan komisi perusahaan (%): ");
        komisi = sc.nextDouble();
        System.out.print("Masukkan resiko keterlambatan (%): ");
        resikoTerlambat = sc.nextDouble();
        System.out.print("Masukkan jumlah transaksi: ");
        jumlahTransaksiDriver = sc.nextInt();

        //Menghitung Keuntungan Variabel
        keuntunganDriver = (tarifDasar * jarak - biayaBBM * jarak) * (1-(komisi / 100)) * (1-(resikoTerlambat / 100)) * jumlahTransaksiDriver;

        //Output Keuntungan Driver
        System.out.println("Keuntungan Driver adalah: Rp. " + keuntunganDriver);



        // === KEUNTUNGAN MERCHANT ===
        //Input Variabel Keuntungan Driver
        System.out.println("\n=== KEUNTUNGAN MERCHANT ===");
        System.out.print("Masukkan harga jual makanan: Rp. ");
        hargaJualMakanan = sc.nextInt();
        System.out.print("Masukkan biaya maknanan: Rp. ");
        biayaMakanan = sc.nextInt();
        System.out.print("Masukkan komisi perusahaan (%): ");
        komisi = sc.nextDouble();
        System.out.print("Masukkan resiko kerusakan barang (%): ");
        resikoKerusakan = sc.nextDouble();
        System.out.print("Masukkan jumlah transaksi: ");
        jumlahTransaksiMerchant = sc.nextInt();

        //Menghitung Keuntungan Merchant
        keuntunganMerchant = (hargaJualMakanan - biayaMakanan) * (1-(komisi / 100)) * (1-(resikoKerusakan / 100)) * jumlahTransaksiMerchant;

        //Output Keuntungan Merchant
        System.out.println("Keuntungan merchant adalah Rp. " + keuntunganMerchant);



        // === RATA-RATA KEUNTUNGAN SEMUA TRANSAKSI ===
        System.out.println("\n=== RATA-RATA KEUNTUGAN DARI SEMUA TRANSAKSI ===");

        //Menghitung Total Keuntungan
        totalKeuntungan = keuntunganDriver + keuntunganMerchant;

        //Menghitung Total Transaksi 
        totalTransaksi = jumlahTransaksiDriver + jumlahTransaksiMerchant;

        //Menghitung Rata-rata Keuntungan
        rataKeuntungan = totalKeuntungan / totalTransaksi;

        //Output Rata-rata Keuntungan
        System.out.println("Rata-rata keuntungan dari semua transaksi adalah Rp. " + rataKeuntungan);



        // === PERSENTASE KONTRIBUSI ===
        System.out.println("\n === PERSENTASE KONTRIBUSI MAASING-MASING MITRA ===");
        
        //Menghitung Persentase Kontribusi Mitra Driver
        persDriver = keuntunganDriver / totalKeuntungan * 100;

        //Output Persentase Kontribusi Mitra Driver
        System.out.println("Persentase kontribusi mitra driver adalah " + (int) persDriver + "%");

        //Mengitung Persentase Kontribusi Mitra Merchant
        persMerchant = keuntunganMerchant / totalKeuntungan * 100;

        //Output Persentase Kontribusi Mitra Merchant
        System.out.println("Persentase kontribusi mitra merchant adalah " + (int) persMerchant + "%");

        sc.close();
    }
}