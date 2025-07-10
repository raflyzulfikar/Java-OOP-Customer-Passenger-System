class Penumpang extends Pelanggan {
    String maskapai;
    double hargaTiket;
    double diskon;
    public Penumpang(String nama, String jenisIdentitas, String maskapai, double hargaTiket, double diskon) {
        super(nama, jenisIdentitas);
        this.maskapai = maskapai;
        this.hargaTiket = hargaTiket;
        this.diskon = diskon;
    }

    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        System.out.println("Maskapai: " + maskapai);
        System.out.println("Harga Tiket: " + hargaTiket);
        System.out.println("Diskon: " + diskon + "%");
    }
}