class Manager extends Employee{
    String company;
    
    Manager(String name) {
        super(name);
    }
    /*
    Manager(String name, String address) {
        super(name);
        this.address = address;
    } */
    
    void sayHello(String name) {
        System.out.println("Hi " + name + " My name is Manager " + this.name);
    }
}