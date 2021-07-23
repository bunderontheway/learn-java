class GoRide extends Gojek {
    String nama;
    String lokasi;
    String alamat_tujuan;
    int tips;
    
    
    
    GoRide(String nama, String lokasi, String alamat_tujuan, int tips) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.alamat_tujuan = alamat_tujuan;
        this.tips = tips;
    }
    
    
    GoRide(String nama, String lokasi, String alamat_tujuan) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.alamat_tujuan = alamat_tujuan;
        tips = 0;
    }
    
    GoRide(String nama, String alamat_tujuan) {
        this.nama = nama;
        this.alamat_tujuan = alamat_tujuan;
    }
    
    
    
    void pesananAnda() {
        //int harga = super.harga_goride();
        System.out.println("Halo " + nama + ", anda ingin pergi dengan GO RIDE dari " + lokasi + " menuju " + alamat_tujuan);
        System.out.println("Harga yang anda perlukan adalah " + super.harga_goride());
        System.out.println("tips yang diberikan adalah " + tips);
    }
    
    
    void totalTagihan(int fee) {
        //sebelum ngeprint total, ngeprint harga goride
        //harga_goride + additionalharga
        int jumlah;
        jumlah = super.harga_goride() + fee;
        System.out.println("Harga GoRide " + super.harga_goride());
        System.out.println("Harga total " + jumlah);
    }
    
    
    
}