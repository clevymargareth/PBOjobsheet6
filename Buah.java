public class Buah {
    private String nama;
    private String warna;
    private double harga;

    public Buah() {
    }

    public Buah(String nama, String warna, double harga) {
        this.nama = nama;
        this.warna = warna;
        this.harga = harga;
    }
    
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getWarna() { 
        return warna; 
    }
    public void setWarna(String warna) { 
        this.warna = warna; 
    }

    public double getHarga() { 
        return harga; 
    }
    public void setHarga(double harga) { 
        this.harga = harga; 
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah : " + nama);
        System.out.println("Warna     : " + warna);
        System.out.println("Harga     : " + harga);
    }
}