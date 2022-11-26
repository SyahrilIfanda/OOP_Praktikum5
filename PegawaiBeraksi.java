public class PegawaiBeraksi {
  public static void main(String[] args) {
    // Membuat Object dengan Constructor
    // PRAKTIKUM 5 MEMBUAT CONSTRUCTOR
    Pegawai syahril = new Manager("Syahril Ifanda", 5000000, 1000000);
    Pegawai aulia = new Programmer("Aulia Rachman", 4000000, 400000);

    /* Memberi attribute dan memberi nilai */
    // syahril.setNama("Syahril Ifanda");
    // syahril.setGajiPokok(5000000);
    // syahril.setTunjangan(1000000);

    // aulia.setNama("Aulia Rachman");
    // aulia.setGajiPokok(4000000);
    // aulia.setBonus(400000);

    /* Mengakses Method */
    syahril.cetakInfo();
    System.out.println();
    aulia.cetakInfo();
  }
}
