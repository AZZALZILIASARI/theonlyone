
/**
 * Class Lingkaran merupakan class yang berfungsi untuk
 * menghimpun data r (jari- jari), diameter dan luas area segitiga
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lingkaran extends BangunDatar
{
    private double radius;
    
    /**
     * Method ini berfungsi untuk mengisikan data ke dalam atribut
     * radius.
     * @param radius berfungsi untuk menerima data radius.
     */
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    /**
     * Method ini merupakan method overriding.
     * Konsep yang digunakan pada method ini adalah polimorfisme dinamis
     * karena kita menggunakan inheritance (pewarisan) pada class BangunDatar
     * @param return mengembalikan luas area lingkaran.
     */
    @Override
    double getLuas() {
        return Math.PI * radius * radius;
    }
}
