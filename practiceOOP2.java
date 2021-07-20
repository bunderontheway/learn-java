class Datapos {
    int id_toko;
    String nama_toko;
    String lokasi_toko;
	String jenis_toko;
    double omset_toko;
    
    void tampilData() {
        System.out.println("ID TOKO : " + id_toko);
        System.out.println("NAMA TOKO : " + nama_toko);
        System.out.println("LOKASI TOKO : " + lokasi_toko);
		System.out.println("JENIS TOKO : " + jenis_toko);
		System.out.println("OMSET TOKO : " + omset_toko);
    }
}

class Produk {

	//harusnya di array, karena bisa banyak, ntar coba cari tambah array
	String nama_produk;
	String deskripsi_produk;
	String harga_produk;
	int jumlah_produk;
	
	void daftarMenu() {
		System.out.println(nama_produk);
		System.out.println(deskripsi_produk);
		System.out.println(harga_produk);
		System.out.println(jumlah_produk);
	}

	void tambahProduk() {
	
	}
	
	void hapusProduk() {
	
	}
	
	void editProduk() {
	
	}
}




class Main {
    public static void main(String[] args) {
    
	Datapos toko1 = new Datapos();
	Produk produktoko1 = new Produk();
	toko1.id_toko = 001;
	toko1.nama_toko = "Toko Sukses Jaya";
	toko1.lokasi_toko = "Mampang Prapatan";
	toko1.jenis_toko = "Toko Sembako";
	toko1.omset_toko = 5000000;
	toko1.tampilData();

    }
    
}




