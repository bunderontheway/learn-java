abstract class Gojek {
    
    
    abstract void totalTagihan(int fee);
    void lokasiDriver() {
        System.out.println("Lokasi driver ditemukan");
    }
    
    //service
    int harga_goride() {
        return 20000;   
    }
    
    int harga_gocar() {
        return 50000;
    }
}