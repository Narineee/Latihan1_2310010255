package hitung;

public class MatematikaBeraksi {
   public static void main(String[] args) {
       Matematika nia = new Matematika(5, 5);
       
       System.out.println("Penjumlahan : " + nia.setPenjumlahan());
       System.out.println("Pengurangan : " + nia.setPengurangan());
       System.out.println("Perkalian : " + nia.setPerkalian());
       System.out.println("Pembagian : " + nia.setPembagian());
   }
}
