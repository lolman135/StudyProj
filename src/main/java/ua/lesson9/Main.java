package ua.lesson9;

public class Main {
    public static void main(String[] args) {

        Product<Integer> product1 = new Product<>(1232, 34);
        getProductInfo(product1);

        Product<String> product2 = new Product<>("A1-10321", 100);
        getProductInfo(product2);
    }

    public static void getProductInfo(Product product){
        System.out.println("Product id: " + product.getId() + "; price: " + product.getPrice());
    }
}
