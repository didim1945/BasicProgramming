import java.util.Scanner;

public class StudiKasus2JB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lebar, panjang, diameter, sisi;

        System.out.print("Masukkan lebar tanah: ");
        lebar = sc.nextInt();
        System.out.print("Masukkan panjang tanah: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan diameter kolam: ");
        diameter = sc.nextInt();
        System.out.print("Masukkan sisi taman: ");
        sisi = sc.nextInt();

        sc.close();
        
        int luasTanah = lebar * panjang;
        double luasKolam = 3.14 * (diameter/2) * (diameter/2);
        double luasTaman = sisi * sisi;

        double sisaLuasTanah = luasTanah - luasKolam - luasTaman;

        System.out.print("Luas tanah yang tidak digunakan Pak Tono adalah " + sisaLuasTanah + "m2");

    }
}

import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Masukkan n (1-9) : ");
            int n = sc.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("Error : n harus 1 sampai 9");
            } else {

                System.out.println("Pola A :");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                        if (j < i) System.out.print(" ");
                    }
                    System.out.println();
                }

                System.out.println();

                System.out.println("Pola B :");
                int i = 1;
                while (i <= n) {
                    int s = 1;
                    while (s <= n - i) {
                        System.out.print(" ");
                        s++;
                    }
                    int b = 1;
                    while (b <= 2 * i - 1) {
                        System.out.print("*");
                        b++;
                    }
                    System.out.println();
                    i++;
                }
            }

            System.out.print("Ulangi? (y/t) : ");
            ulang = sc.next();
            System.out.println();
        } while (ulang.equalsIgnoreCase("y"));

    }
}

import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, total = 0, max = 0, min = 0, lulus = 0;

        System.out.print("Nilai : ");
        int nilai = sc.nextInt();

        while (nilai != -1) {
            if (nilai < 0 || nilai > 100) {
                System.out.println("Error : nilai harus 0 sampai 100");
            } else {
                if (count == 0) {
                    max = nilai;
                    min = nilai;
                } else {
                    if (nilai > max) max = nilai;
                    if (nilai < min) min = nilai;
                }
                count++;
                total += nilai;
                if (nilai >= 60) lulus++;
            }
            System.out.print("Nilai : ");
            nilai = sc.nextInt();
        }

        if (count == 0) {
            System.out.println("Tidak ada data nilai yang valid");
        } else {
            double rata = (double) total / count;
            System.out.println("===== REKAP NILAI =====");
            System.out.println("Banyak data : " + count);
            System.out.println("Rata-rata   : " + rata);
            System.out.println("Nilai max   : " + max);
            System.out.println("Nilai min   : " + min);
            System.out.println("Jumlah lulus: " + lulus);
        }
    }
}

import java.util.Scanner;

public class  {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // System.out.print("Masukkan nilai N : ");
        // int nilai = sc.nextInt();
        int nilai = 4;

        if (nilai <= 0){
        System.out.print("Eror : n harus lebih dari 0");
        }

        else {
            int genap = 0, ganjil = 0, kelipatan3 = 0;

            System.out.print("Deret               : ");
            for ( int i = 1; i<=nilai; i++){
            System.out.print(i);
            
            if (i <= nilai);
            if (i % 2 == 0) genap += i;
            else ganjil += i;
            if ( i % 3 == 0) kelipatan3 += i;

            }
            System.out.println();

            System.out.println("Jumlah Genap        : " + genap);
            System.out.println("Jumlah Ganjil       : " + ganjil);
            System.out.println("Jumlah Kelipatan 3  : " + kelipatan3);

        }







    }
    
}