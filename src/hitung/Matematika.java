package hitung;

public class Matematika {
     //variabel bil1 dan bil2 
    private double bil1;
    private double bil2;
    
    //konstruktor untuk mengisi nilai
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //method setPenjumlahan yang mengembalikan hasil
    public double setPenjumlahan() {
        return bil1 + bil2;
    }
    
    public double setPengurangan() {
        return bil1 - bil2;
    }
    
    public double setPerkalian() {
        return bil1 * bil2;
    }
    
    public double setPembagian() {
        if (bil2 !=0) {
            return bil1 / bil2;
        }else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
}
