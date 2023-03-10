public class Helikopter2 {
    public static void main{String args[]}{
        //Pembuat Object
        Helikopter1 heliku = new Helikopter1();
        Helikopter1 helimu = new Helikopter1();

        //Memanggil Attribut dan memberi nilai
        heliku.warna = "Hitam";
        heliku.tahunProduksi = 1992;
        helimu.warna = "Biru";
        helimu.tahunProduksi = 2004;

        System.out.println("heliku warna = "+heliku.warna);
        System.out.println("heliku tahun = "+heliku.tahunProduksi);

        System.out.println("helimu warna = "+helimu.warna);
        System.out.println("helimuu tahun = "+helimu.tahunProduksi);

    }
}