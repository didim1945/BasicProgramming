public class StudiKasus2Jobsheet2 {
    public static void main(String[] args) {

        int lebarTanah = 30;
        int panjangTanah = 100;
        int diameterKolam = 5;
        int sisiTaman = 2;

        // Hitung luas tanah
        int luasTanah = lebarTanah * panjangTanah;

        // Hitung luas kolam
        double luasKolam = 3.14 * (diameterKolam / 2.0) * (diameterKolam / 2.0);

        // Hitung luas taman
        int luasTaman = sisiTaman * sisiTaman;

        // Hitung sisa luas tanah
        double sisaLuasTanah = luasTanah - luasKolam - luasTaman;


        System.out.println("Luas tanah yang tidak digunakan Pak Tono adalah " + sisaLuasTanah + " m2");
    }
    
}
