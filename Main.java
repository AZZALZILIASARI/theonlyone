import java.util.Scanner;

/**
 * Tampilable merupakan interface
 * Tampilable memiliki method abstrak tampil()
 */
interface Tampilable{
    // Method abstrak
    void tampil();
}

/**
 * Class main ini merupakan class utama dimana terdapat method main yang berfungsi
 * untuk menjalankan program.
 * program yang akan dijalankan pada kode ini adalah
 * menghitung luas segitiga.
 * menghitung luas lingkaran.
 * menghitung luas persegi panjang.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    private static double alasSegitiga;
    private static double tinggiSegitiga;
    private static double radiusLingkaran;
    private static double panjangPP;
    private static double lebarPP;
    
    /**
     * Method ini berfungsi untuk mengisikan data ke atribut yang telah ditentukan.
     */
    public static void inputData() {
        // membuat objek scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan alas segitiga: ");
        alasSegitiga = input.nextDouble();
        System.out.println("Masukkan tinggi segitiga: ");
        tinggiSegitiga = input.nextDouble();
        System.out.println("Masukkan radius lingkaran: ");
        radiusLingkaran = input.nextDouble();
        System.out.println("Masukkan panjang persegi panjang: ");
        panjangPP = input.nextDouble();
        System.out.println("Masukkan lebar persegi panjang: ");
        lebarPP = input.nextDouble();
    }
    
    /**
     * Method ini berfungsi untuk membuat objek dari 3 class yaitu segitiga, lingkaran, dan persegi panjang.
     * Method ini juga berfungsi untuk Menampilkan luas dari ketiga bentuk bangun datar tersebut.
     */
    public static void tampilLuas(){  
        // membuat objek dari class Segitiga
        BangunDatar segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);

        // membuat objek dari class Lingkaran
        BangunDatar lingkaran = new Lingkaran(radiusLingkaran);
        
        // membuat objek dari class PersegiPanjang
        BangunDatar persegiPanjang = new PersegiPanjang(panjangPP, lebarPP);
        
        System.out.println("===========================================");
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.getLuas());  
        System.out.println("===========================================");    
    }  
    
    /**
     * Method ini merupakan method yang berfungsi untuk menjalankan program
     * dan memanggil method selanjutnya yang dibutuhkan untuk menjalankan proses
     */
    public static void main(String[] args) {
        //Memanggil method inputData
        inputData();
        
        // Referensi static method
        Tampilable tampilable = Main::tampilLuas;
        
        // Memanggil interface method
        tampilable.tampil();
    }
}
