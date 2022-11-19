import java.util.*;

public class Main {


    public static void main(String[] args) {
        Product sugar = new Product(" Сахар", 90.0, 1.0);
        Product milk = new Product(" Молоко", 80, 1.0);
        Product onion = new Product(" Лук", 40, 1.5);
        Product sausage = new Product(" Колбаса", 400, 0.5);
        ProductList productList = new ProductList();
        productList.addProduct(sugar);
        productList.addProduct(milk);
        productList.addProduct(onion);
        productList.addProduct(sausage);
        productList.removeProduct(onion.getNameProducts());


        System.out.println(productList);

    }
}









