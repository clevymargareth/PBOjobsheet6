public class Apel extends Buah {
    private String jenis;

    public Apel() {
        super();
    }

    public Apel(String nama, String warna, double harga, String jenis) {
        super(nama, warna, harga);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public void saranPenyajian() {
        super.tampilkanInfo();
        System.out.println("Jenis Apel: " + jenis);
        System.out.println("Saran Penyajian: Cocok dimakan langsung dalam keadaan segar.");
    }
}