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