package pasha;

 
 public class Product {
    
        private int number;
        private int quantity;
        private String name;
        private double price;
    
        public Product(){
            number = 0;
            name = "";
            quantity = 0;
            price = 0;
        }
    
        //Constructor Parameter
        public Product(double price2,int quantity2,String name , Double price3){
            this.number = number;
            this.quantity = quantity;
            this.name = name;
            this.price = price3;
        }
    
        public Product(int number2, String name2, int quantity2, double price2) {
            //TODO Auto-generated constructor stub
        }

        public int getNumber() {
            return number;
        }
    
        public void setNumber(int number) {
            this.number = number;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getPrice() {
            return price;
        }
    
        public void setPrice(double price) {
            this.price = price;
        }
    
        public void print() {
            System.out.println("Number : " + number);
            System.out.println("Quantity : " + quantity);
            System.out.println("Name : " + name);
            System.out.println("Price : " + price);
        }
    
    }
 
    
    