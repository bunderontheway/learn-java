class GoRide extends Harga {
    private String nama;
    private String lokasi;
    private String alamat_tujuan;
    private int tips;
    
    
    GoRide(String nama, String lokasi, String alamat_tujuan) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.alamat_tujuan = alamat_tujuan;
        tips = 0;
    }
    
    GoRide(String nama, String lokasi, String alamat_tujuan, int tips) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.alamat_tujuan = alamat_tujuan;
        this.tips = tips;
    }
    
    void pesananAnda() {
        //int harga = super.harga_goride();
        System.out.println("Halo " + nama + ", anda ingin pergi dengan GO RIDE dari " + lokasi + " menuju " + alamat_tujuan);
        System.out.println("Harga yang anda perlukan adalah " + super.harga_goride());
        System.out.println("tips yang diberikan adalah " + tips);
    }
    
}