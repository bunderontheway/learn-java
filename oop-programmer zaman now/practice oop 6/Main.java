class Main {
    public static void main(String[] args) {
        
        var category = new Category();
        category.setId("ID");
        category.setId(null);
        
        //getter dan setter dibuat agar data tidak bisa diudate
        System.out.println(category.getId());
    }
}