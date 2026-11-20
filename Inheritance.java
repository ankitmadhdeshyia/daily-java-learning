class Product{
    String productName;
    double price;
    public void company( String name,double price){
          this.productName=name;
          this.price=price;
    }
    public void displayProduct(){
        System.out.println("This is a"+" "+this.productName);
        System.out.println("Price of"+ this.productName+"is"+" "+this.price);
    }

}
class Shirt extends Product{
     String brandName;
     String manufactureDate;
   
}
class TShirt extends Product{

}

public class Inheritance{
    public static void main(String[] args) {
        
    }
}