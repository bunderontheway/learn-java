class Main {
    public static void main(String[] args) {
       
       var budi = new GoRide("budi", "slipi", "palmerah", 5000);
       budi.pesananAnda();
       
       budi = new GoCar("budi", "slipi", "palmerah");
       budi.pesananAnda();
       
       var alif = new GoCar("alif", "slipi", "palmerah");
       alif.pesananAnda();
       
       
       var coba = new GoRide("alif", "malang", "jakarta");
       coba.pesananAnda();
       
    }
}