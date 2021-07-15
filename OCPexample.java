    abstract class Cinema {
        public Double price;
        abstract Double calculateAdminFee();
    }
     
    class StandardCinema extends Cinema {
        public StandardCinema(Double price) {
            this.price = price;
        }
     
        @Override
        Double calculateAdminFee() {
            return price * 10 / 100;
        }
    }
     
    class DeluxeCinema extends Cinema {
        public DeluxeCinema(Double price) {
            this.price = price;
        }
     
     
        @Override
        Double calculateAdminFee() {
            return price * 12 / 100;
        }
    }
     
    class PremiumCinema extends Cinema {
        public PremiumCinema(Double price) {
            this.price = price;
        }
     
        @Override
        Double calculateAdminFee() {
            return price * 20 / 100;
        }
    }
    
    class CoupleCinema extends Cinema {
        public CoupleCinema(Double price) {
            this.price = price;
        }
     
        @Override
        Double calculateAdminFee() {
            return price * 15 / 100;
        }
    }
    
    class Main {
        public static void main(String[] args) {
            StandardCinema standardCinema = new StandardCinema(100.0);
            Double adminFee = standardCinema.calculateAdminFee();
            System.out.println(adminFee);
        }
    }