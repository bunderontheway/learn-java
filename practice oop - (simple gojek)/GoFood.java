class GoFood extends GoRide {
    String nama_toko;
    String nama_menu;
    String lokasi_toko;
    
    GoFood(String nama, String alamat_tujuan, String nama_toko, String nama_menu, String lokasi_toko) {
        super(nama, alamat_tujuan);
        this.nama_toko = nama_toko;
        this.nama_menu = nama_menu;
        this.lokasi_toko = lokasi_toko;
    }
    
    
    void pesananAnda() {
        System.out.println("Halo " + nama + ", anda ingin pesan GoFood " + nama_menu); 
        System.out.println("dari " + nama_toko); 
        System.out.println("Pesanan anda akan diantar dari " + lokasi_toko + " menuju " + alamat_tujuan);
        //System.out.println("Harga yang anda perlukan adalah " + super.harga_gocar);
    }
}