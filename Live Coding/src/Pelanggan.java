class Pelanggan {
    String nama;
    String jenisIdentitas;

    public Pelanggan(String nama, String jenisIdentitas) {
        this.nama = nama;
        this.jenisIdentitas = jenisIdentitas;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Identitas: " + jenisIdentitas);
    }

    public void tampilkanInfo(String tujuanPerjalanan) {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Identitas: " + jenisIdentitas);
        System.out.println("Tujuan Perjalanan: " + tujuanPerjalanan);
    }
}




