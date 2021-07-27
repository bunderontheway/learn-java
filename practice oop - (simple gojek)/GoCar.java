class GoCar extends GoRide {
    
    
    GoCar(String nama, String lokasi, String alamat_tujuan) {
        super(nama, lokasi, alamat_tujuan);
    }
    
    
    void pesananAnda() {
        System.out.println("Halo " + nama + ", anda ingin pergi dengan GO CAR dari " + lokasi + " menuju " + alamat_tujuan);
        //System.out.println("Harga yang anda perlukan adalah " + super.harga_gocar);
    }
}
    