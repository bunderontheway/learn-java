class Employee {
    int nip;
    String nama;
    String jabatan;
    int salary;
    
    void printDetail() {
        System.out.println(nip);
        System.out.println(nama);
        System.out.println(jabatan);
    }
    
    void totalSalary(int bonus) {
        System.out.println(salary + bonus);
    }
    
    
}


class Manager extends Employee {
    
    
}

class Main {
    public static void main(String[] args) {
    
        
        
        Employee employee1 = new Employee();
        employee1.nip = 87654321;
        employee1.nama = "alif";
        employee1.jabatan = "magang";
        employee1.salary = 5000;
        employee1.printDetail(); 
        employee1.totalSalary(1000); //masukin angka 500
    
        //System.out.println(employee1.nip);
        //System.out.println(employee1.nama);
        //System.out.println(employee1.jabatan);
        
        
        Manager manager1 = new Manager();
        manager1.nip = 876;
        manager1.nama = "zabuza";
        manager1.jabatan = "anbu";
        
        manager1.printDetail();
        
        //System.out.println(manager1.nama);
    
    }
    
}