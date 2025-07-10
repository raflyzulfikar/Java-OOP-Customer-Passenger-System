public class Main {
    public static void main(String[] args) {
        Penumpang penumpang1 = new Penumpang("Rafly Zulfikar AlKautsar", "KTP", 
                "Garuda Indonesia", 1500000, 10);

        System.out.println("=== Informasi Penumpang ===");
        penumpang1.tampilkanInfo();

        System.out.println("\n=== Informasi Penumpang + Tujuan ===");
        penumpang1.tampilkanInfo("Jakarta-Bali");
    }
}