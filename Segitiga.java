
/**
 * Class Segitiga merupakan class yang berfungsi untuk
 * menghimpun data alas, tinggi dan luas area segitiga
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Segitiga extends BangunDatar
{
    private double alas;
    private double tinggi;
    
    /**
     * Method ini berfungsi untuk mengisikan data ke dalam atribut
     * alas dan tinggi.
     * @param alas dan tinggi berfungsi untuk menerima data alas dan tinggi
     */
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    /**
     * Method ini berfungsi untuk mengisikan data ke atribut alas
     * Konsep ini merupakan konsep encapsulation
     * @param newAlas berfungsi untuk menerima data
     */
    public void setAlas(double newAlas) {
        this.alas = newAlas;
    }
    
    /**
     * Method ini berfungsi untuk mengambil data dari atribut alas
     * Method ini masuk ke dalam konsep encapsulation
     * @return mengembalikan data dari atribut alas
     */
    public double getAlas() {
        return alas;
    }
    
    /**
     * Method ini berfungsi untuk mengisikan data ke atribut tinggi
     * Konsep ini merupakan konsep encapsulation
     * @param newTinggi berfungsi untuk menerima data
     */
    public void setTinggi(double newTinggi) {
        this.tinggi = newTinggi;
    }
    
    /**
     * Method ini berfungsi untuk mengambil data dari atribut tinggi
     * Method ini masuk ke dalam konsep encapsulation
     * @return mengembalikan data dari atribut tinggi
     */
    public double getTinggi() {
        return tinggi;
    }
    
    /**
     * Method ini merupakan method overriding.
     * Konsep yang digunakan pada method ini adalah polimorfisme dinamis
     * karena kita menggunakan inheritance (pewarisan) pada class BangunDatar
     * @param return mengembalikan luas area segitiga.
     */
    @Override
    double getLuas() {
        return 0.5 * alas * tinggi;
    }
}
