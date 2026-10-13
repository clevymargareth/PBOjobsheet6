public class BuahDemo {
    public static void main(String[] args) {
        Mangga mangga1 = new Mangga("Mangga Harumanis", "Hijau", 15000, "Matang Manis");
        
        System.out.println(" INFO MANGGA AWAL ");
        mangga1.periksaKondisi();

        System.out.println("\n SETELAH MODIFIKASI ATRIBUT ");
        mangga1.setWarna("Kuning Kehijauan");
        mangga1.setHarga(17500);
        mangga1.setTingkatKematangan("Sangat Matang");

        mangga1.periksaKondisi();
        
        System.out.println();

        Apel apel1 = new Apel("Apel Washington", "Merah", 25000, "Manis Berair");
        System.out.println(" INFO APEL ");
        apel1.saranPenyajian();
    }
}