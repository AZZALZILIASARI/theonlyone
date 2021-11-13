
/**
 * Class ini merupakan Class abstrak. karena pada class ini memiliki
 * setidaknya satu method abstrak.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class BangunDatar
{
    String color;
    
    /**
     * Method ini berfungsi untuk mengisikan data ke atribut color
     * Method ini merupakan konsep encapsulation
     * @param color berfungsi untuk menerima data color
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Method ini berfungsi untuk mengambil data dari atribut color
     * Method ini merupakan konsep encapsulation
     * @return mengembalikan data dari atribut color
     */
    public String getColor() {
        return this.color;
    }
    
    /**
     * Method ini merupakan method abstract
     * Method ini tidak memiliki implementasi atau tidak ada bentuk
     * konkritnya. simpelnya method ini tidak memiliki isi, hanya nama method saja.
     */
    abstract double getLuas();
}
