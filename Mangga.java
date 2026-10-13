public class Mangga extends Buah {
    private String tingkatKematangan;

    public Mangga() {
        super();
    }

    public Mangga(String nama, String warna, double harga, String tingkatKematangan) {
        super(nama, warna, harga);
        this.tingkatKematangan = tingkatKematangan;
    }

    public String getTingkatKematangan() { 
        return tingkatKematangan; 
    }
    public void setTingkatKematangan(String tingkatKematangan) { 
        this.tingkatKematangan = tingkatKematangan; 
    }

    public void periksaKondisi() {
        super.tampilkanInfo();
        System.out.println("Kematangan: " + tingkatKematangan);
    }
}