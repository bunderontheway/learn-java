class Main {
    public static void main(String[] args) {
        
        /*
        Liskov substitution principle
        LSP adalah aturan yang berlaku bagi hierarki pewarisan / inheritance, 
        LSP juga tentang delegasi tanggung jawab, 
        jadi apa yang parent bisa lakukan maka child juga harus bisa melakukan hal tsb
        =================================================================================
        Awalnya pada product terdapat fungsi getExpiredDate, namun ketika diturunkan ke product yang lain nya
        seperti smartphone, fungsi getExpiredDate tidak akan digunakan, oleh karena itu fungsi tersebut dipisah
        dan dibuat pada class FoodProduct. 
        
        Sehingga smartphone bisa diturunkan dari product dan melakukan apa yang parents bisa lakukan
        
        */
        
        Vegetable vegetable = new Vegetable();
        System.out.println(vegetable.getName());
        System.out.println(vegetable.getExpiredDate());
        
        
        Smartphone smartphone = new Smartphone();
        System.out.println(smartphone.getName());
    }
}