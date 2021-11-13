
/**
 * Class PersegiPanjang merupakan class yang berfungsi untuk
 * menghimpun data panjang, lebar dan luas area persegi panjang
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersegiPanjang extends BangunDatar
{
    private double panjang;
    private double lebar;
    
    /**
     * Method ini berfungsi untuk mengisikan data ke dalam atribut
     * panjang dan lebar.
     * @param panjang dan lebar berfungsi untuk menerima data panjang dan lebar
     */
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    /**
     * Method ini berfungsi untuk mengisikan data ke atribut panjang
     * Konsep ini merupakan konsep encapsulation
     * @param newPanjang berfungsi untuk menerima data
     */
    public void setPanjang(double newPanjang) {
        this.panjang = newPanjang;
    }
    
    /**
     * Method ini berfungsi untuk mengambil data dari atribut panjang
     * Method ini masuk ke dalam konsep encapsulation
     * @return mengembalikan data dari atribut panjang
     */
    public double getPanjang() {
        return panjang;
    }
    
    /**
     * Method ini berfungsi untuk mengisikan data ke atribut lebar
     * Konsep ini merupakan konsep encapsulation
     * @param newLebar berfungsi untuk menerima data
     */
    public void setLebar(double newLebar) {
        this.lebar = newLebar;
    }
    
    /**
     * Method ini berfungsi untuk mengambil data dari atribut lebar
     * Method ini masuk ke dalam konsep encapsulation
     * @return mengembalikan data dari atribut lebar
     */
    public double getLebar() {
        return lebar;
    }
    
    /**
     * Method ini merupakan method overriding.
     * Konsep yang digunakan pada method ini adalah polimorfisme dinamis
     * karena kita menggunakan inheritance (pewarisan) pada class BangunDatar
     * @param return mengembalikan luas area PersegiPanjang.
     */
    @Override
    double getLuas() {
        return panjang * lebar;
    }
}
