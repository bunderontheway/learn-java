class ManagerApp {
    public static void main(String[] args) {
        
        
        var manager = new Manager("sule");
        manager.sayHello("Budi");
        
        var vp = new VicePresident("budi");
        vp.sayHello("anduk");
        
        
        //contoh
        
        Employee employee = new Employee("eko");
        employee.sayHello("budi");
     
     
        employee = new Manager ("eko1");
        employee.sayHello("budi1");
        
        employee = new VicePresident("eko2");
        employee.sayHello("budi2");
        
        sayHello(new Employee("Budi"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Susilo"));
    }
    
    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            //jika ingin melakukan check dan konversi bisa dilakukan dengan cara
            // VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP" + employee.name);
        }
        
        else if(employee instanceof Manager) {
            System.out.println("Hello Manager" + employee.name);
        } 
        
        else {
            System.out.println("Hello " + employee.name);
        }
        
    }
}