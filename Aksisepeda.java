public class Aksisepeda { 
	public static void main(String[] args) { 
	 //membuat objek
	 Sepeda sepedaBalap = new Sepeda(); 
	 Sepeda sepedagunung= new Sepeda();
	 
	 //mengakses atribut dan method
	 sepedagunung.jenis = "sepedagunung";
      sepedagunung.merek= "TREK POLYGON";
	 int gearSepeda = sepedaBalap.gear; 
	     System.out.println("Sepeda deengan jenis "+sepedagunung.jenis);
		     System.out.println("dengan merek  "+sepedagunung.merek);
			     System.out.println("Memiliki 2 roda ");
	 
	  System.out.println("jumlah gear sepeda "+gearSepeda );
	 sepedaBalap.ngerem(); 
	 } 
} 
 //System.out.println(gearSepeda);
        /*Helikopter1 heliku = new Helikopter1();
        Helikopter1 helimu = new Helikopter1();

        //Memanggil Attribut dan memberi nilai
        heliku.warna = "Hitam";
        heliku.tahunProduksi = 1992;
        helimu.warna = "Biru";
        helimu.tahunProduksi = 2004;

        System.out.println("heliku warna = "+heliku.warna);
        System.out.println("heliku tahun = "+heliku.tahunProduksi);
*/