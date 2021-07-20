public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Eko" , "Subang");
        //person1.name = "Eko";
        //person1.address = "Subang";
        // person1.country = tidak bisa diubah karena final
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        
        //memanggil method
        person1.sayHello("budi");
        
        Person person2 = new Person("Budi");
        Person person3;
        person3 = new Person();
        person3.name = "zabuza";
        person3.sayHello("Naruto");
     
    }
}