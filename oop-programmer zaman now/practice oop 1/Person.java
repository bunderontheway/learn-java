class Person {
    String name;
    String address;
    final String country = "Indonesia";
    
    
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    Person(String name) {
        this(name, null);
    }
    
    Person() {
        this(null);
    }
    
    //deklarasi method
    void sayHello (String name) { //paramName merupakan parameter
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}