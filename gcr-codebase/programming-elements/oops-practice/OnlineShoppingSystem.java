

import java.util.*;

public class OnlineShoppingSystem {

    // ================= Abstract Class ======================================
    static abstract class Person {
        private int id;
        private String name;
        private String email;

        public Person(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + email;
        }
    }

    // ================= Customer =================
    static class Customer extends Person {
        private String city;
        private boolean primeMember;

        public Customer(int id, String name, String email, String city, boolean primeMember) {
            super(id, name, email);
            this.city = city;
            this.primeMember = primeMember;
        }

        public String getCity() {
            return city;
        }

        public boolean isPrimeMember() {
            return primeMember;
        }

        @Override
        public String toString() {
            return super.toString() + " " + city + " Prime:" + primeMember;
        }
    }

    // ================= Seller =================
    static class Seller extends Person {
        private String companyName;
        private double sellerRating;


        

        public Seller(int id, String name, String email,
                      String companyName, double sellerRating) {
            super(id, name, email);
            this.companyName = companyName;
            this.sellerRating = sellerRating;
        }

        public String getCompanyName() {
            return companyName;
        }

        public double getSellerRating() {
            return sellerRating;
        }

        @Override
        public String toString() {
            return super.toString() + " " + companyName + " Rating:" + sellerRating;
        }
    }

    // ================= Product =================
    static class Product {
        private int productId;
        private String productName;
        private String category;
        private double price;
        private double rating;
        private boolean inStock;
        private Seller seller;

        public Product(int productId, String productName,
                       String category, double price,
                       double rating, boolean inStock,
                       Seller seller) {

            this.productId = productId;
            this.productName = productName;
            this.category = category;
            this.price = price;
            this.rating = rating;
            this.inStock = inStock;
            this.seller = seller;
        }

        public int getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }

        public double getRating() {
            return rating;
        }

        public boolean isInStock() {
            return inStock;
        }

        public Seller getSeller() {
            return seller;
        }

        @Override
        public String toString() {
            return productId + " " + productName + " " + category +
                    " Price:" + price +
                    " Rating:" + rating +
                    " Stock:" + inStock +
                    " Seller:" + seller.getCompanyName();
        }
    }

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Seller> sellers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        // Customers
        customers.add(new Customer(1,"Rahul","rahul@gmail.com","Delhi",true));
        customers.add(new Customer(2,"Priya","priya@gmail.com","Agra",false));
        customers.add(new Customer(3,"Aman","aman@gmail.com","Delhi",true));
        customers.add(new Customer(4,"Neha","neha@gmail.com","Mathura",false));

        // Sellers
        Seller s1=new Seller(101,"Rohit","r@gmail.com","Amazon",4.8);
        Seller s2=new Seller(102,"Mohit","m@gmail.com","Flipkart",4.4);
        Seller s3=new Seller(103,"Ankit","a@gmail.com","Reliance",4.9);

        sellers.add(s1);
        sellers.add(s2);
        sellers.add(s3);

        // Products
        products.add(new Product(1,"Laptop","Electronics",70000,4.9,true,s1));
        products.add(new Product(2,"Phone","Electronics",30000,4.8,true,s2));
        products.add(new Product(3,"Mouse","Electronics",800,4.3,false,s1));
        products.add(new Product(4,"Keyboard","Electronics",1500,4.5,true,s2));
        products.add(new Product(5,"Book","Education",500,4.7,true,s3));
        products.add(new Product(6,"Bag","Fashion",1200,4.2,false,s3));
        products.add(new Product(7,"Shoes","Fashion",2500,4.6,true,s2));
        products.add(new Product(8,"Watch","Accessories",5000,4.8,true,s1));

        // Example Stream Operation
        System.out.println("All Product Names:");
        products.stream()
                .map(Product::getProductName)
                .forEach(System.out::println);
    }
}