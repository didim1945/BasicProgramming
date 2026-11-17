import java.util.Scanner;

public class Tugas2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String menu [] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"}; 
        int harga [] = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("======= DAFTAR MENU KAFE =======");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-1d. %-18s Rp%5d%n", (i + 1), menu[i], harga[i]);
        }

        int jumlahPesanan;

        do {
            System.out.print("\nMasukkan jumlah pesanan: ");
            jumlahPesanan = sc.nextInt();
            if (jumlahPesanan < 1) {
                System.out.println("Jumlah pesanan harus lebih dari 0.");
            }
        } while (jumlahPesanan < 1);

        sc.nextLine();
        String pesanan [] = new String[jumlahPesanan];
        int totalBiaya = 0;

        System.out.println("\n======= INPUT PESANAN =======");
        for (int i = 0; i < jumlahPesanan; i++) {
            int indeks;
            do {
                System.out.print("Masukkan menu ke-" + (i + 1) + ": ");
                String cariMenu = sc.nextLine();
                indeks = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(cariMenu)) {
                        indeks = j;
                        break;
                    }
                }
                if (indeks == -1) {
                    System.out.println("Menu tidak tersedia! Silakan input kembali.");
                }
            } while (indeks == -1);
            pesanan [i] = menu [indeks];
            totalBiaya += harga [indeks];
        }

        System.out.println("\n======= STRUK PEMESANAN =======");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan [i]);
        }

        System.out.println("--------------------------------");
        System.out.println("Total biaya: Rp" + totalBiaya);
        sc.close();
    }
}