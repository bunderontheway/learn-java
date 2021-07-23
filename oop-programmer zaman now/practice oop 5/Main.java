class Main {
    public static void main(String[] args) {
        
        // var location = new Location(); // ini akan ERROR karena dilakukan abstract class
        
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}