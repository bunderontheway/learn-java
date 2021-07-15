class Main {
    public static void main(String[] args) {
        var counter = 1;
        
        for(; counter<=10;) {
            System.out.println("Perulangan ke-" + counter);
            
            counter++;
        }
		
		
		for(var ulang = 11; ulang <= 10;) {
			System.out.println("Perulangan cara lain ke-" + ulang);
			
			ulang++;
		
		}
    }
}